package com.frontEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FrontendService {

	@LoadBalanced
	@Bean
	RestTemplate resttemplate() {
		return new RestTemplate();
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	
	
	public String reultReview() {
		String url ="http://gateway/reviewservice/review/all";
		return restTemplate.getForObject(url, String.class);
	}



	public String resultProduct() {
		String url ="http://gateway/productservice/product/all";
		return restTemplate.getForObject(url, String.class);
	}
	
	
	
}
