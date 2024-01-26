package com.example.awsmarket.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    @GetMapping("/")// ' / ' 생략 가능
    public String test(Model model) {
        model.addAttribute("data", "Hello This is Spring web app!");
        return "index";
    }
}