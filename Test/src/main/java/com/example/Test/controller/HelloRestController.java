package com.example.Test.controller;


import org.springframework.web.bind.annotation.*;
import com.example.Test.dto.User;

@RestController
public class HelloRestController {


    // curl localhost:8080/hello -w "\n"
    //uc1
    @GetMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz! ! !";

    }
}