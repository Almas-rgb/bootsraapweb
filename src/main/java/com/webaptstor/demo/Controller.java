package com.webaptstor.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



public class Controller {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Главная страница 111");
        model.addAttribute("", "");
        return "index";
    }
}
