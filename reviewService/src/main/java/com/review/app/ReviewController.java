package com.review.app;

import java.util.Collection;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ReviewController {

	private ReviewService reviewService;
	public ReviewController(ReviewService reviewService) {
		this.reviewService = reviewService;
	}


	@GetMapping("/all")
	public Collection<Review> getAllReviews(){
		return reviewService.findAllreviews();
		
	}
	
	@GetMapping("/byProduct/{productId}")
	public Collection<Review> getByProductId(@PathVariable(name="productId") int productId){
		return reviewService.findByproductId(productId);
	}
	
	@GetMapping("/byId/{productId}")
	public Optional<Review> getById(@PathVariable(name="productId") int productId){
		return reviewService.findById(productId);
		
	}
}
