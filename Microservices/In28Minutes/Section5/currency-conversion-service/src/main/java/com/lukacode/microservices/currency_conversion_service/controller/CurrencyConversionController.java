package com.lukacode.microservices.currency_conversion_service.controller;

import com.lukacode.microservices.currency_conversion_service.globalExceptionHandler.CurrencyNotFoundException;
import com.lukacode.microservices.currency_conversion_service.model.CurrencyConversion;
import com.lukacode.microservices.currency_conversion_service.service.CurrencyConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

    private final CurrencyConversionService currencyConversionService;

    @Autowired
    public CurrencyConversionController(CurrencyConversionService currencyConversionService) {
        this.currencyConversionService = currencyConversionService;
    }

    @GetMapping("/currency-conversion/from/{fromCurrency}/to/{toCurrency}/quantity/{amount}")
    public ResponseEntity<CurrencyConversion> getCurrencyConversion(@PathVariable String fromCurrency, @PathVariable String toCurrency,
                                                                   @PathVariable double amount){

        var result=currencyConversionService.calculateCurrencyConversion(1001L,fromCurrency,toCurrency,amount);


        return new ResponseEntity<>(result, HttpStatus.OK);


    }
}