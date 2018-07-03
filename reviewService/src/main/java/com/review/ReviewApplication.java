package com.review;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.review.app.Review;
import com.review.app.ReviewRepository;

@SpringBootApplication
public class ReviewApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}
	
	
	private ReviewRepository reviewRepository;
	public ReviewApplication(ReviewRepository reviewRepository) {
		this.reviewRepository = reviewRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Review review = new Review(1, "this product sux", 1);
		Review review2 = new Review(2, "this product is perfect", 5);
		
		reviewRepository.save(review);
		reviewRepository.save(review2);
	}
}
