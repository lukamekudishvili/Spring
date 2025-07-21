package com.lukacode.kafkaTutorial.ProductsMicroservice.service;

import com.lukacode.kafkaTutorial.ProductsMicroservice.Model.Product;

import java.util.concurrent.ExecutionException;

public interface ProductService  {
    String createProduct(Product product) throws ExecutionException, InterruptedException;
}
