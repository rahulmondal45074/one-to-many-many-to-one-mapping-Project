package com.example.onetomanymanytooneassignment.controller;

import com.example.onetomanymanytooneassignment.model.User;
import com.example.onetomanymanytooneassignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("users")
    public String addUsers(@RequestBody List<User> newUsers){
        return userService.addUsers(newUsers);
    }

    @GetMapping("user/id/{id}")
    public Optional<User> getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @GetMapping("users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
