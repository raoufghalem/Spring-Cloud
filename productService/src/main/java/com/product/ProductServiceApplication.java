package com.product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.product.app.Product;
import com.product.app.ProductRepository;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	private ProductRepository productRepository;
	public ProductServiceApplication(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
			Product product1 = new Product(1, "oranges", "fruit", 20);
			Product product2 = new Product(2, "bananas", "fruit", 15);
			Product product3 = new Product(3, "potato", "veggie", 31);
			productRepository.save(product1);productRepository.save(product2);
			productRepository.save(product3);
	}
}
