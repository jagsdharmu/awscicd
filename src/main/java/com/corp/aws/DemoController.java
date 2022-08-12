package com.corp.aws;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class DemoController {
    @GetMapping("/method")
    public String sayHello() {
        return "Hello";
    }
}