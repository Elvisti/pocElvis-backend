package com.elvis.pocBackend.adapter.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;

public class UserConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserConsumer.class);

    private String topicName;

    public UserConsumer(@Value("${topic.name.consumer") String topicName) {
        this.topicName = topicName;
    }

    @KafkaListener(topics = "${topic.name.consumer}", groupId = "group_id")
    public void consume(ConsumerRecord<String, String> payload) {
        LOGGER.info("Tópico: {}", topicName);
        LOGGER.info("key: {}", payload.key());
        LOGGER.info("Headers: {}", payload.headers());
        LOGGER.info("Partion: {}", payload.partition());
        LOGGER.info("Order: {}", payload.value());

    }
}
