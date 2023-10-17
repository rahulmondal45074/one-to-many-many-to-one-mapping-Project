package com.example.onetomanymanytooneassignment.repo;

import com.example.onetomanymanytooneassignment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {

}
