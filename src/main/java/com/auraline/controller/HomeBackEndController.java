package com.auraline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeBackEndController {
	@GetMapping(value = { "/backend", "/backend/index" })
    public String index(Model model) {
        
            return "backend/index";
    }
    @GetMapping("/403")
    public String authorize(Model model) {
        return "home/403";
    }
}
