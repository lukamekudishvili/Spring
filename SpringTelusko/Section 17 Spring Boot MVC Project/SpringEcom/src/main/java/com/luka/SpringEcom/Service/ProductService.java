package com.luka.SpringEcom.Service;

import com.luka.SpringEcom.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(Long id);
    List<Product> findByName(String name);
    List<Product> findByCategory(String category);
    Product saveProduct(Product product);
    List<Product> saveAll(List<Product> products);
    Product updateProduct(Product product);
    boolean deleteProduct(Product product);
    boolean deleteProduct(Long id);
}
