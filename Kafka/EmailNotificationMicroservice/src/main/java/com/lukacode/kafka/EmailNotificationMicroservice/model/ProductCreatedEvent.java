package com.lukacode.kafka.EmailNotificationMicroservice.model;

public record ProductCreatedEvent(
        String productId,
        ProductCreateDto productCreateDto) {

    @Override
    public String toString() {
        return  "productID: "+productId+" " + productCreateDto.toString();
    }
}
