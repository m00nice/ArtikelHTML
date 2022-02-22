package com.example.springthingy.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class TestController {
    @RestController
    public class bob{
        @GetMapping("/bruh")
        public String bruh(){
            return "bruh";
        }

    }
}
