package com.turbine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaProducerApplication implements CommandLineRunner{
	
	@Autowired
	KafkaTemplate<String, Customer> kafkaTemplate;
	private final static String TOPIC = "jsonCustomer";

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		List<Customer> lc = new ArrayList<>();
		lc.add(new Customer(1, "Alex",Math.random()*10000) );
		lc.add(new Customer(2, "Brian", Math.random()*10000));
		lc.add(new Customer(3, "Charlie", Math.random()*10000));
		lc.add(new Customer(4, "Danny", Math.random()*10000));
		lc.add(new Customer(5, "Emily", Math.random()*10000));
		
		while(true) {
			Customer ct = lc.get( new Random().nextInt(lc.size()));
			ct.setBallance(Math.random()*10000);
			kafkaTemplate.send(TOPIC, ct);
			System.out.println("Producing : " + ct.toString());
			TimeUnit.SECONDS.sleep(1);
		}
		
		
		
	}
}
