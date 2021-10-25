package com.elvis.pocBackend.adapter.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

public class UserProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserProducer.class);

    private String topicName;
    private final KafkaTemplate<String, String> kafkaTemplate;

    public UserProducer(@Value("${topic.name.producer}") String topicName, KafkaTemplate<String, String> kafkaTemplate) {
        this.topicName = topicName;
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String message) {
        LOGGER.info("Payload enviado: {}", message);
        kafkaTemplate.send(topicName, message);
    }
}
