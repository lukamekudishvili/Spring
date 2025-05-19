package com.luka.SpringEcom.controller;

import com.luka.SpringEcom.Service.ProductService;
import com.luka.SpringEcom.Service.ProductServiceImpl;
import com.luka.SpringEcom.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.reactive.context.ReactiveWebApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/allProducts")
    public ResponseEntity<List<Product>> getProducts() {
        List<Product> products = productService.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/productById/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable(value = "productId") Long id) {
        Product product=productService.findById(id);
        if(product==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/productByName/{name}")
    public ResponseEntity<List<Product>> getProductByName(@PathVariable String name) {

        List<Product> product= new ArrayList<>();
        product=productService.findByName(name);
        if(product.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
    @GetMapping("/productByCategory/{category}")
    public ResponseEntity<List<Product>> getProductByCategory(@PathVariable String category) {
        List<Product> products=new ArrayList<>();
        products=productService.findByCategory(category);

        if(products.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(products,HttpStatus.OK);
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @PostMapping("/addProducts")
    public ResponseEntity<List<Product>> addMultipleProduct(@RequestBody List<Product> products) {
        return new ResponseEntity<>(productService.saveAll(products), HttpStatus.CREATED);
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<Product> updateProduct(@RequestParam Long id, @RequestBody Product product) {
        Product productTobeUpdated=productService.findById(id);
        if(productTobeUpdated==null)return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(productService.updateProduct(product), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteProduct(@RequestBody Product product) {
        boolean deleted= productService.deleteProduct(product);
        if(deleted)return new ResponseEntity<>("Successfully deleted!", HttpStatus.OK);
        return new ResponseEntity<>("Failure, Product is not deleted!", HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/deleteById")
    public ResponseEntity<String> deleteProduct(@RequestParam Long id) {
        boolean deleted= productService.deleteProduct(id);
        if(deleted)return new ResponseEntity<>("Successfully deleted!", HttpStatus.OK);
        return new ResponseEntity<>("Failure, Product is not deleted!", HttpStatus.BAD_REQUEST);
    }

}
