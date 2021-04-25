package com.hbl.sBoot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
        Logger logger = LoggerFactory.getLogger(HelloController.class);
        logger.info("this is slf4j");
        return "Hello World"+lastName;
    }
}
