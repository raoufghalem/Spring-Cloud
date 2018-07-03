package com.frontEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;



@EnableFeignClients
@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableHystrix
public class FrontEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontEndApplication.class, args);
	}
}
