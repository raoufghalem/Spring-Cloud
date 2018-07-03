package com.review.app;

import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ReviewService {
	
	private ReviewRepository reviewRepository;
	public ReviewService(ReviewRepository reviewRepository) {
		this.reviewRepository = reviewRepository;
	}
	
	//find all reviews
	public Collection<Review> findAllreviews(){
		return reviewRepository.findAll();
	}

	// find reviews by product Id
	public Collection<Review> findByproductId(int productId) {
		return reviewRepository.findByProductId(productId);
	}


	//find reviews by review PK
	public Optional<Review> findById(int productId) {
		return reviewRepository.findById(productId);
	}
	

}
