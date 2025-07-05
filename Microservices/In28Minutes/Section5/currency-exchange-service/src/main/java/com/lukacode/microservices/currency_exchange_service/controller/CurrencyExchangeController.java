package com.lukacode.microservices.currency_exchange_service.controller;

import com.lukacode.microservices.currency_exchange_service.model.CurrencyExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/currency-exchange")
public class CurrencyExchangeController {
    @Autowired
    private Environment environment;


    @GetMapping("/from/{fromCurrency}/to/{toCurrency}")
    public ResponseEntity<CurrencyExchange> retrieveExchangeValue(@PathVariable String fromCurrency, @PathVariable String toCurrency) {

        var exchangeRate=new CurrencyExchange(1000L, fromCurrency, toCurrency, BigDecimal.valueOf(50));
        var port=environment.getProperty("local.server.port");
        exchangeRate.setEnvironment(port);
        return new ResponseEntity<>(exchangeRate, HttpStatus.OK);

    }
}
