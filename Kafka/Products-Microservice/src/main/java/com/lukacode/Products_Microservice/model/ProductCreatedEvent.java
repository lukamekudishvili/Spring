package com.lukacode.Products_Microservice.model;

import java.math.BigDecimal;

public record ProductCreatedEvent(
        String productId,
        ProductCreateDto productCreateDto) {
}
