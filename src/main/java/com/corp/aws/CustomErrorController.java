package com.corp.aws;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CustomErrorController implements ErrorController {

    @GetMapping("/error")
    public String handleError(){
        return "Error - page not found";
    }

    //@Override
    public String getErrorPath(){
        return "/error";
    }
}
