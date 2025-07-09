package com.lukacode.microservices.currency_conversion_service.globalExceptionHandler;

public class CurrencyNotFoundException extends RuntimeException {
    public CurrencyNotFoundException(String message) {
        super(message);
    }
}
