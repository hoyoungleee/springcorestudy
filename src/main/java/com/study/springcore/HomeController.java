package com.study.springcore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    public HomeController() {
        System.out.println("HomeController 자동 생성됨");
    }

    @GetMapping("/")
    public String home() {
        System.out.println("서버에 요청 들어옴!");
        return "home";
    }
    @GetMapping("/hello")
    public String hello() {
        System.out.println("서버에 요청 들어옴!");
        return "hello";
    }
}
