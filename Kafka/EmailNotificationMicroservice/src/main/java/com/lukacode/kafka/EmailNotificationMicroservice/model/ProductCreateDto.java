package com.lukacode.kafka.EmailNotificationMicroservice.model;

import java.math.BigDecimal;

public record ProductCreateDto(
        String title,
        BigDecimal price,
        Integer quantity
        ) {

        @Override
        public String toString() {
                return "ProductCreateDto{" +
                        "title='" + title + '\'' +
                        ", price=" + price +
                        ", quantity=" + quantity +
                        '}';
        }
}
