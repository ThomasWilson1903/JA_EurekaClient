package com.example.ja_eurekaclient;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {


    @GetMapping("/")
    public String show(Model model){
        return "test";
    }
}
