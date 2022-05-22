package com.kafka.example.controller;

import com.kafka.example.beans.RestMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MessageController {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @PostMapping("msg")
    public void publish(@RequestBody RestMessage request){
        kafkaTemplate.send("class145",request.getMessage());
    }
}
