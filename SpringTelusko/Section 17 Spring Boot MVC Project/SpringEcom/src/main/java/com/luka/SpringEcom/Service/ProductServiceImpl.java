package com.luka.SpringEcom.Service;

import com.luka.SpringEcom.Repository.ProductRepository;
import com.luka.SpringEcom.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {

        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {

        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> findByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    @Override
    @Transactional
    public Product saveProduct(Product product) {

        return productRepository.save(product);
    }

    @Override
    @Transactional
    public List<Product> saveAll(List<Product> products) {
        return productRepository.saveAll(products);
    }

    @Override
    public Product updateProduct(Product product) {

        return productRepository.save(product);
    }

    @Override
    public boolean deleteProduct(Product product) {
        Product dbProduct=findById(product.getId());
        if(dbProduct==null){
            return false;
        }

        productRepository.delete(product);
        return true;
    }

    @Override
    public boolean deleteProduct(Long id) {
        Product dbProduct=findById(id);
        if(dbProduct==null){
            return false;
        }
        productRepository.deleteById(id);
        return true;
    }
}
