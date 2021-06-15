package com.example.herokudemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HerokuController {
    
    @RequestMapping("/")
    public String index() {
        return "hello";
    }
    
}
