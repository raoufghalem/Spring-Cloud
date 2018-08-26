package com.turbine;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumerListener {
	
	@KafkaListener(topics="jsonCustomer")
	public void consume(Customer message) {
		System.out.println("Consuming : "+ message.toString());
	}
	

}
