package com.lukacode.Products_Microservice.model;

import java.math.BigDecimal;

public record ProductCreateDto(
        String title,
        BigDecimal price,
        Integer quantity
        ) {

}
