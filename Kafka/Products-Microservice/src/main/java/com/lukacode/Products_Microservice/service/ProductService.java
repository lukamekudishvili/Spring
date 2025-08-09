package com.lukacode.Products_Microservice.service;

import com.lukacode.Products_Microservice.model.ProductCreateDto;

public interface ProductService {
    String createProduct(ProductCreateDto productCreateDto);
}
