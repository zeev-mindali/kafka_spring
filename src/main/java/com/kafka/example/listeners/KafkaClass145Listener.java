package com.kafka.example.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaClass145Listener {
    @KafkaListener(topics = {"class145"}, groupId = "zeev")
    void listener(String data){
        System.out.println("listerner recived: "+data);
    }
}
