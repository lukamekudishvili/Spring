package com.lukacode.Products_Microservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.Map;

@Configuration
public class KafkaConfig {
    @Value(("${spring.kafka.topic.product-created.topic}"))
    private String topicName;

    @Value(("${spring.kafka.topic.product-created.partitions}"))
    private short partitions;

    @Value(("${spring.kafka.topic.product-created.replicas}"))
    private short replicas;

    @Bean
    NewTopic createTopic(){
        return TopicBuilder
                .name(topicName)
                .partitions(3)
                .replicas(3)
                .configs(Map.of("min.insync.replicas","2"))
                .build();
    }
}
