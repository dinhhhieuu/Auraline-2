package com.auraline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/backend")
public class ProductBackEndController {
	@GetMapping("products")
	public String index(Model model) {
		return "backend/products/index";
	}
}
