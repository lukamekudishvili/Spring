package com.lukacode.microservices.currency_conversion_service.service;

import com.lukacode.microservices.currency_conversion_service.client.CurrencyExchangeClient;
import com.lukacode.microservices.currency_conversion_service.model.CurrencyConversion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CurrencyConversionService {
    private final CurrencyExchangeClient client;
    private final Environment environment;
    private final Logger log=LoggerFactory.getLogger(CurrencyConversionService.class);

    @Autowired
    public CurrencyConversionService(CurrencyExchangeClient client, Environment environment) {
        this.client = client;
        this.environment=environment;
    }

    private CurrencyConversion getConversionRate(String from, String to){
        var start=System.currentTimeMillis();
        log.info("Request ready to send: {}", System.currentTimeMillis());
        var response=client.getCurrencyRate(from,to);
        var end=System.currentTimeMillis();
        log.info("Get Response after {} seconds: {}",end-start, response);

        return response;
    }

    public CurrencyConversion calculateCurrencyConversion(Long id, String from, String to,
                                                          double quantity){
        var response=getConversionRate(from, to);
        var rate=response.getConversionRate();

        var calculatedAmount=rate*quantity;

        return new CurrencyConversion(id,from,to,quantity, rate,calculatedAmount,response.getEnvironment());
    }
}
