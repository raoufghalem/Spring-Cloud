package com.frontEnd;

import java.util.Collection;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;




@FeignClient(name="reviewservice", fallback=Myfallback.class)
//@Headers("accept: application/json")
public interface feignReviewInterface {
	@RequestMapping("/review/all")
	public Collection<Review> showAllMyReviews();
	
	
}

@FeignClient(name="productservice", fallback=Myfallback.class)
//@Headers("accept: application/json")
 interface feignproductInterface {
	@RequestMapping("/product/all")
	public Collection<Product> showAllMyProducts();
	
}

@Component
class Myfallback implements feignReviewInterface, feignproductInterface{
	@Override
	public Collection<Review> showAllMyReviews() {
		return null;
	}

	@Override
	public Collection<Product> showAllMyProducts() {
		return null;
	}
}
