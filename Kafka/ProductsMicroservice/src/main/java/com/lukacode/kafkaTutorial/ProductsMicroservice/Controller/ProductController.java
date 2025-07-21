package com.lukacode.kafkaTutorial.ProductsMicroservice.Controller;

import com.lukacode.kafkaTutorial.ProductsMicroservice.Model.CustomErrorMessage;
import com.lukacode.kafkaTutorial.ProductsMicroservice.Model.Product;
import com.lukacode.kafkaTutorial.ProductsMicroservice.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());


    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Object> createProduct(@RequestBody Product product){
        String productId;
        try{
            productId=productService.createProduct(product);
        }catch (Exception e){
            var caughtError=new CustomErrorMessage(e.getMessage(), LocalDateTime.now(), "/products");

            LOG.error("Error Caught during product creation: {}",e.getMessage());

            return new ResponseEntity<>(caughtError, HttpStatus.INTERNAL_SERVER_ERROR);
        }


        return new ResponseEntity<>(productId, HttpStatus.CREATED);
    }
}
