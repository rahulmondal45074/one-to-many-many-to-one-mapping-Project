package com.example.onetomanymanytooneassignment.service;

import com.example.onetomanymanytooneassignment.model.User;
import com.example.onetomanymanytooneassignment.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepo iUserRepo;

    public String addUsers(List<User> newUsers) {
        iUserRepo.saveAll(newUsers);
        return "user added";
    }

    public Optional<User> getUserById(Integer id) {
        return iUserRepo.findById(id);
    }

    public List<User> getAllUser() {
        return iUserRepo.findAll();
    }
}
