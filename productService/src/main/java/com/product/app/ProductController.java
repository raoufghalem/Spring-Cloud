package com.product.app;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	private ProductService productService;
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@Value("${server.port}")
	private String instance;
	
	@GetMapping("/instance")
	public String getInstance() {
		return instance;
	}

	@GetMapping("/all")	
	public Collection<Product> getAllProducts(){
		return productService.findAll();
	}
	
}
