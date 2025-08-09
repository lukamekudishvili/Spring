package com.lukacode.kafka.EmailNotificationMicroservice;

import com.lukacode.kafka.EmailNotificationMicroservice.model.ProductCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(topics = {"product-created-topic"})
public class ProductCreatedEventHandler {
    private final Logger log= LoggerFactory.getLogger(this.getClass());

    @KafkaHandler
    public void handle(ProductCreatedEvent productCreatedEvent){
        log.info("Received a new event: "+productCreatedEvent.productCreateDto().title());
        System.out.println(productCreatedEvent.toString());
    }
}
