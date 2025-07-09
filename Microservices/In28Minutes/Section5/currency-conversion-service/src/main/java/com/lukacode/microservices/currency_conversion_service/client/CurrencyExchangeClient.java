package com.lukacode.microservices.currency_conversion_service.client;

import com.lukacode.microservices.currency_conversion_service.model.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

//@FeignClient(name="currency-exchange", url="${currency.exchange.url}")
@FeignClient(name="currency-exchange")  // if we dont give actual url, client load balancer will figure out
                                        // what url should it send request from eureka naming server
public interface CurrencyExchangeClient {

    @GetMapping("/currency-exchange/from/{fromCurrency}/to/{toCurrency}")
    CurrencyConversion getCurrencyRate(
            @PathVariable("fromCurrency") String fromCurrency,
            @PathVariable("toCurrency") String toCurrency
    );
}
