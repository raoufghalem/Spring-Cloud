package com.turbine;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;




@EnableKafka
@Configuration
public class KafkaConfig {
	
	@Bean
	public ConsumerFactory<String, Customer> consumerFactory() {
		Map<String, Object> configs = new HashMap<>();
		configs.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		configs.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		configs.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		configs.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");
//		configs.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		configs.put(ConsumerConfig.GROUP_ID_CONFIG, "group_One");
		
		return new DefaultKafkaConsumerFactory<String, Customer>(configs , new StringDeserializer(),
				new JsonDeserializer<>(Customer.class));
	}
	
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, Customer> kafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, Customer> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());
			return factory;
	}
	
}	
