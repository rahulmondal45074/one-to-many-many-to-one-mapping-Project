package com.example.onetomanymanytooneassignment.controller;


import com.example.onetomanymanytooneassignment.model.Orders;
import com.example.onetomanymanytooneassignment.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("orders")
    public String addOrders(@RequestBody List<Orders> newOrders){
        return orderService.addOrders(newOrders);
    }

    @GetMapping("order/id/{id}")
    public Optional<Orders> getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }

    @GetMapping("orders")
    public List<Orders> getAllOrders(){
        return orderService.getAllOrders();
    }
}
