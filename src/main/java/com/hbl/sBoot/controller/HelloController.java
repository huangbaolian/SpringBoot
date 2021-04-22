package com.hbl.sBoot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HelloController {

    @Value("${person.last-name}")
    private String lastName;
    //@ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World"+lastName;
    }
}
