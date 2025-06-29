package com.lukacode.microservices.limits.controller;

import com.lukacode.microservices.limits.config.LimitsServicePropertiesConfiguration;
import com.lukacode.microservices.limits.model.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limits-api")
public class LimitsController {
    @Autowired
    private LimitsServicePropertiesConfiguration limitsServicePropertiesConfiguration;

    @GetMapping("/limits")
    public ResponseEntity<Limit> getLimits(){
        return new ResponseEntity<>(
                new Limit(limitsServicePropertiesConfiguration.getMinimum(), limitsServicePropertiesConfiguration.getMaximum()),
                HttpStatus.OK);
    }
}
