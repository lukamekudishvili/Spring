package com.lukacode.Products_Microservice.controller;

import com.lukacode.Products_Microservice.model.ProductCreateDto;
import com.lukacode.Products_Microservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody ProductCreateDto productCreateDto){
        var result=productService.createProduct(productCreateDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

}
