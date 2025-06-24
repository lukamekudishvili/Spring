package com.lukacode.restful_Web_Services_Demo.controller;

import com.lukacode.restful_Web_Services_Demo.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {


    @GetMapping("/hello")
    public HelloWorldBean greeting(){
        return new HelloWorldBean("Hello world");
    }

    @GetMapping("/hello/{name}")
    public HelloWorldBean greeting(@PathVariable("name") String name){
        return new HelloWorldBean("Hello world "+name);
    }


}
