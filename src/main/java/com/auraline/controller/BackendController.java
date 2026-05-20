package com.auraline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class BackendController {

    @GetMapping("/dashboard")
    public String dashboard() {
        return "backend/dashboard";
    }

    @GetMapping("/product")
    public String product() {
        return "backend/product";
    }

    @GetMapping("/news")
    public String news() {
        return "backend/news";
    }

    @GetMapping("/promotions")
    public String promotions() {
        return "backend/promotions";
    }

}