package com.practice.security.controller;

import com.practice.security.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello form home controller";
    }

    @GetMapping("/{userName}")
    public String getUser(@PathVariable("userName") String userName){
        return "Hello "+userName+" !!!!!";
    }
}
