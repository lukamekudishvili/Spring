package com.lukacode.restful_Web_Services_Demo.controller;

import com.lukacode.restful_Web_Services_Demo.HelloWorldBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    private final MessageSource messageSource;

    @Autowired
    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/hello")
    public HelloWorldBean greeting(){
        return new HelloWorldBean("Hello world");
    }

    @GetMapping("/hello/{name}")
    public HelloWorldBean greeting(@PathVariable("name") String name){
        return new HelloWorldBean("Hello world "+name);
    }

    @GetMapping(value = "/hello-i18n" ,produces = "text/plain;charset=UTF-8")
    public String helloWorldI18N(){
        Locale locale= LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default greeting", locale);
    }


}
