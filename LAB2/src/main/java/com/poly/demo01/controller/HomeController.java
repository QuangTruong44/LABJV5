package com.poly.demo01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/poly")
public class HomeController {
    @GetMapping("/home")
    public String getViewHome() {
        return "view/home";
    }
}
