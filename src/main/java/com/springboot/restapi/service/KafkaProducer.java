package com.springboot.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private final String TOPIC = "clients";

	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;

	public void sendMessage(String message){
		System.out.println(String.format("$$$ -> Producing message --> %s",message));
		this.kafkaTemplate.send(TOPIC, message);
	}
}
