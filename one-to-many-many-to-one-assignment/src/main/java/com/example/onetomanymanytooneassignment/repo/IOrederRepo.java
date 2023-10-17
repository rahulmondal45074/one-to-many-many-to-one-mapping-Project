package com.example.onetomanymanytooneassignment.repo;

import com.example.onetomanymanytooneassignment.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrederRepo extends JpaRepository<Orders,Integer> {
}
