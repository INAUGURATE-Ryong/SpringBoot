package com.example.demo.day6.naversearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
public class MainController {
    @GetMapping("/main")
    public ModelAndView main(){

        return new ModelAndView("main");
    }
}
