package com.luka.SpringEcom.Repository;

import com.luka.SpringEcom.model.Product;

import java.util.List;

public interface ProductCustomRepository {
    List<Product> findByName(String name);
    List<Product> findByCategory(String category);
}
