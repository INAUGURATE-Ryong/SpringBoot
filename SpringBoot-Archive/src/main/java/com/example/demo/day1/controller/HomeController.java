package com.example.demo.day1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    public String home(Model model){
//        model.addAttribute("name","뽀로로");
        String name ="뽀로로";
        model.addAttribute("name",name);

        return "hello world!";  //
    }
}
