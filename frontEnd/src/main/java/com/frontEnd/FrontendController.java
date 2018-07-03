package com.frontEnd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {

	FrontendService frontendService;
	public FrontendController(FrontendService frontendService) {
		this.frontendService = frontendService;
	}

	@GetMapping({"","/","index"})
	public String homePage(Model model) {
		 String message="hey there";
		model.addAttribute("message",message);
		return "index";
	}
	
	@GetMapping("/product/all")
	public String showAllProducts(Model model) {
		model.addAttribute("result",frontendService.resultProduct());
		return "showall";
	}
	
	@GetMapping("/review/all")
	public String showAllReviews(Model model) {
		model.addAttribute("result",frontendService.reultReview());
		return "showall";
	}
	
}
