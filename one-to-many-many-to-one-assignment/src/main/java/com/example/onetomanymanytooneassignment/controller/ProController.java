package com.example.onetomanymanytooneassignment.controller;

import com.example.onetomanymanytooneassignment.model.Category;
import com.example.onetomanymanytooneassignment.model.Product;
import com.example.onetomanymanytooneassignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProController {

    @Autowired
    ProductService productService;

    @PostMapping("products")
    public String addProducts(@RequestBody List<Product> newProducts){
        return productService.addProducts(newProducts);
    }

    @GetMapping("products/category/{category}")
    public List<Product> getAllProductsByCategory(@PathVariable Category category){
        return productService.getAllProductsByCategory(category);
    }

    @DeleteMapping("product/id/{id}")
    public String deleteProductById(@PathVariable Integer id){
        return productService.deleteProductById(id);
    }

    @GetMapping("products")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

}
