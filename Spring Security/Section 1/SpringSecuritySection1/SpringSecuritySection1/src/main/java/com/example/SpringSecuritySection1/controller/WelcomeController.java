package com.example.SpringSecuritySection1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping
    public ResponseEntity<String> sayWelcome(){
        String str="Hello there, this is sayWelcome() method!!!";
        return new ResponseEntity<>(str, HttpStatus.OK);
    }
}
