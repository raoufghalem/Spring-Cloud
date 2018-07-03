package com.frontEnd;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import feign.Feign;

@Controller
public class FrontendController {

	feignReviewInterface frontendService;
	feignproductInterface frontendPService;
	public FrontendController(feignReviewInterface frontendService, feignproductInterface frontendPService) {
		this.frontendService = frontendService;
		this.frontendPService = frontendPService;
	}
	

	@GetMapping({"","/","index"})
	public String homePage(Model model) {
		 String message="hey there";
		model.addAttribute("message",message);
		return "index";
	}
	
//	@GetMapping("/product/all")
//	public String showAllProducts(Model model) {
//		model.addAttribute("result",frontendService.resultProduct());
//		return "showall";
//	}
//	
	@GetMapping("/feignreview/all")
	public String showAllReviews(Model model) {
		model.addAttribute("result",frontendService.showAllMyReviews());
		model.addAttribute("products",frontendPService.showAllMyProducts());
		return "showall";
	}
	
	
}
