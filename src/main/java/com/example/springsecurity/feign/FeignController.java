package com.example.springsecurity.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "feignClient", url = "http://localhost:9090")
public interface FeignController {

    @GetMapping("/greeting")
    public String greeting();
}
