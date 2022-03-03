package com.kafkaExample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaCustomListener {
    @KafkaListener(topics = "custom-topic",groupId = "foo")
     void listener(String data){
        System.out.println("Listener received: " + data);
    };
}
