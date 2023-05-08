package com.exampleappweb.springbootrestapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping (path = "/welcome")
    public String welcome()
    {
        return "Welcome to the App web example...";
    }
}
