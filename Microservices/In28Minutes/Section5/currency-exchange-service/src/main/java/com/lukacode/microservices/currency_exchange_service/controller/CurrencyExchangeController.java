package com.lukacode.microservices.currency_exchange_service.controller;

import com.lukacode.microservices.currency_exchange_service.model.CurrencyExchange;
import com.lukacode.microservices.currency_exchange_service.model.CurrencyNotFoundException;
import com.lukacode.microservices.currency_exchange_service.repository.CurrencyExchangeRepository;
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

    private final Environment environment;
    private final CurrencyExchangeRepository currencyExchangeRepository;

    @Autowired
    public CurrencyExchangeController(Environment environment, CurrencyExchangeRepository currencyExchangeRepository) {
        this.environment = environment;
        this.currencyExchangeRepository = currencyExchangeRepository;
    }

    @GetMapping("/from/{fromCurrency}/to/{toCurrency}")
    public ResponseEntity<CurrencyExchange> retrieveExchangeValue(@PathVariable String fromCurrency, @PathVariable String toCurrency) {

//        var exchangeRate=new CurrencyExchange(1000L, fromCurrency, toCurrency, BigDecimal.valueOf(50));
//        var port=environment.getProperty("local.server.port");
//        exchangeRate.setEnvironment(port);

        var exchangeRate= currencyExchangeRepository.findByFromAndTo(fromCurrency, toCurrency);
        if(exchangeRate==null){
            throw new CurrencyNotFoundException("Currency that been passed not found");
        };
        exchangeRate.setEnvironment(environment.getProperty("server.port"));
        return new ResponseEntity<>(exchangeRate, HttpStatus.OK);

    }
}
