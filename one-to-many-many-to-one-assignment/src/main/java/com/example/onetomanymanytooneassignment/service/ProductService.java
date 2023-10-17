package com.example.onetomanymanytooneassignment.service;

import com.example.onetomanymanytooneassignment.model.Category;
import com.example.onetomanymanytooneassignment.model.Product;
import com.example.onetomanymanytooneassignment.repo.IProduckRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProduckRepo iProduckRepo;

    public String addProducts(List<Product> newProducts) {
        iProduckRepo.saveAll(newProducts);
        return "products are added";
    }

    public List<Product> getAllProductsByCategory(Category category) {
        return iProduckRepo.getAllProductsByCategory(category);
    }

    public String deleteProductById(Integer id) {
        iProduckRepo.deleteById(id);
        return "product deleted";
    }

    public List<Product> getAllProduct() {
        return iProduckRepo.findAll();
    }
}
