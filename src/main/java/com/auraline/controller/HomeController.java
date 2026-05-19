package com.auraline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping({"/","/index"})
	public String home(Model model) {
		return "home/index";
	}
	@GetMapping("/about-us")
	public String about(Model model) {
		return "home/about";
	}
	@GetMapping("/contact-us")
	public String contact(Model model) {
		return "home/contact";
	}
	@GetMapping("/shop")
	public String shop(Model model) {
		return "home/shop";
	}
	@GetMapping("/blog")
	public String blog(Model model) {
		return "home/blog";
	}
	@GetMapping("/product")
	public String product(Model model) {
		return "home/product";
	}
	
	@GetMapping("/404")
	public String error404(Model model) {
		return "home/404";
	}
}