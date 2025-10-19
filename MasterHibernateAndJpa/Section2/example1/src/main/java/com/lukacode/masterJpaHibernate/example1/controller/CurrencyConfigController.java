package com.lukacode.masterJpaHibernate.example1.controller;

import com.lukacode.masterJpaHibernate.example1.config.CurrencyServiceConfiguration;
import com.lukacode.masterJpaHibernate.example1.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/currency")
public class CurrencyConfigController {
    private CurrencyServiceConfiguration currencyServiceConfiguration;

    @Autowired
    public CurrencyConfigController(CurrencyServiceConfiguration currencyServiceConfiguration) {
        this.currencyServiceConfiguration = currencyServiceConfiguration;
    }

    @GetMapping
    public CurrencyServiceConfiguration retrieveAllCourses(){
        return currencyServiceConfiguration;
    }
}
