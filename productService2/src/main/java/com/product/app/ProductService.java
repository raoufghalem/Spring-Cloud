package com.product.app;

import java.util.Collection;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	private ProductRepository productRepository;
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	// return all the products in the database
	public Collection<Product> findAll(){
		return productRepository.findAll();
	}
	
}
