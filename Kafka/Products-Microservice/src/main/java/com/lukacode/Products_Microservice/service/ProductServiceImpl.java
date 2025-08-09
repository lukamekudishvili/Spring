package com.lukacode.Products_Microservice.service;

import com.lukacode.Products_Microservice.model.ProductCreateDto;
import com.lukacode.Products_Microservice.model.ProductCreatedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final KafkaTemplate<String, ProductCreatedEvent> kafkaTemplate;

    @Value("${spring.kafka.topic.product-created.topic}")
    private String productCreatedTopic;


    @Override
    public String createProduct(ProductCreateDto productCreateDto) {

        String productId = UUID.randomUUID().toString();

        var event = new ProductCreatedEvent(productId, productCreateDto);

//        var futureResult=kafkaTemplate.send(productCreatedTopic,productId,event);
//
//        futureResult.whenComplete((result,exception)->{
//           if(exception!=null){
//               log.error("Error during sending message to kafka: {}",exception.getMessage());
//           }else{
//               log.info("message sent successfully: {}",result.getRecordMetadata());
//           }
//        });
//
//      futureResult.join();


        try {
            var result = kafkaTemplate.send(productCreatedTopic, productId, event).get();
        }catch (Exception e){
            log.info(e.getMessage());
        }


        log.info("Returning product id!!!");
        return productId;
    }
}
