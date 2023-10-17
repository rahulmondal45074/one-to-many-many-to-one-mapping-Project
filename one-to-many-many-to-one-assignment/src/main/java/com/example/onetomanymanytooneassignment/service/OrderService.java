package com.example.onetomanymanytooneassignment.service;

import com.example.onetomanymanytooneassignment.model.Orders;
import com.example.onetomanymanytooneassignment.repo.IOrederRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    IOrederRepo iOrederRepo;

    public String addOrders(List<Orders> newOrders) {
        iOrederRepo.saveAll(newOrders);
        return "orders are added";
    }

    public Optional<Orders> getOrderById(Integer id) {
        return iOrederRepo.findById(id);

    }

    public List<Orders> getAllOrders() {
        return iOrederRepo.findAll();
    }
}
