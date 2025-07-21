package com.lukacode.kafka.EmailNotificationMicroservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ProductCreatedEventHandler {
    @Value("${test.topic.name}")
    private String topicName;


    @KafkaListener(topics = {topicName})
    public void handle(){

    }
}
