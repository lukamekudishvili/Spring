package com.lukacode.kafkaTutorial.ProductsMicroservice.service;

import com.lukacode.kafkaTutorial.ProductsMicroservice.Model.Product;
import com.lukacode.kafkaTutorial.ProductsMicroservice.Model.ProductCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

@Service
public class ProductServiceImpl implements ProductService {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());
    private final KafkaTemplate<String, ProductCreatedEvent> kafkaTemplate;
    private final Environment environment;

    @Autowired
    public ProductServiceImpl(KafkaTemplate<String, ProductCreatedEvent> kafkaTemplate, Environment environment) {
        this.kafkaTemplate = kafkaTemplate;
        this.environment = environment;
    }


    @Override
    public String createProduct(Product product) throws ExecutionException, InterruptedException {
        String productId = UUID.randomUUID().toString();
        //persist to database

        var productCreatedEvent = new ProductCreatedEvent(productId, product.getTitle(), product.getPrice(), product.getQuantity());

        /* send message to topic asynchronously*/
        /*
        var future =
                kafkaTemplate.send(environment.getProperty("product.created.events.topic"), productId, productCreatedEvent);

        future.whenComplete((result, exception) ->{
            if(exception!=null){
                LOG.error("******   Error during send message-event to topic: {}", exception.getMessage());
            }else{
                LOG.info("******   Message-event sent successfully to topic: {}", result.getRecordMetadata());
            }
        });*/

        /* send message to topic synchronously*/
        LOG.info("Before Publishing a ProductCreatedEvent");

        var result =
                kafkaTemplate.send(environment.getProperty("product.created.events.topic"), productId, productCreatedEvent).get();

        LOG.info("message sent successfully: topic-{} | partition-{} | offset{}",
                result.getRecordMetadata().topic(), result.getRecordMetadata().partition(),result.getRecordMetadata().offset());
        LOG.info("******   Returning productId: {}", productId);

        return productId;
    }
}
