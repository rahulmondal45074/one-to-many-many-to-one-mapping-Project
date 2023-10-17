package com.example.onetomanymanytooneassignment.repo;


import com.example.onetomanymanytooneassignment.model.Category;
import com.example.onetomanymanytooneassignment.model.Product;
import jakarta.validation.Valid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProduckRepo  extends JpaRepository<Product,Integer> {

    @Modifying
   // @Query(nativeQuery = true,value = "select * from one_to_many_many_to_one.product where product_category =:category")
    @Query(value = "select * from product where product_category=:category", nativeQuery = true)
    List<Product> getAllProductsByCategory(Category category);
}
