package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class OneClass {
    @GetMapping("helloword")
    public String hello(){
        return "Hello Word!";
    }
}


