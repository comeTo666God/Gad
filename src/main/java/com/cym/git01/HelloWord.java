package com.cym.git01;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

    @GetMapping("hello")
    public String hello(){
        return "hello git";
    }
}
