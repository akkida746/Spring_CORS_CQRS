package com.example.springsecurity;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ServerController {

    @GetMapping("/greeting")
    public String greeting(){
        return "Greeting!";
    }

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @PostMapping("/submit")
    public String submit(){
        return "Success";
    }
}
