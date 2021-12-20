package com.example.springsecurity;

import com.example.springsecurity.feign.FeignController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ServerController {

    @Autowired
    private FeignController client;

    @GetMapping("/greeting")
    public String greeting(){
        return "Greeting!";
    }

    @GetMapping("/greeting-feign")
    public String greetingUsingFeignClient(){
        return client.greeting();
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
