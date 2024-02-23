package com.example.demothymeleaf.Controller;

import com.example.demothymeleaf.Dto.TestDto;
import com.example.demothymeleaf.Service.TestService;
import com.example.demothymeleaf.domain.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class MainController {
    private final TestService testService;


    public MainController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/")
    public String hello(Model model){
        List<Test> testList = testService.findall();
        model.addAttribute("testList",testList);
        return "hello";
    }

    @GetMapping("/test")
    @ResponseBody
    public List<Test> test() {
        System.out.println("Received test request");
        List<Test> testList = testService.findall();
        return testList;
    }
}
