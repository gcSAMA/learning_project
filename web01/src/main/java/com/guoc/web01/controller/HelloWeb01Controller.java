package com.guoc.web01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWeb01Controller {

    @RequestMapping(path="/helloWeb01")
    public String helloWeb01(){
        System.out.println("helloWeb01 entered");

        return "helloWeb01";
    }
}
