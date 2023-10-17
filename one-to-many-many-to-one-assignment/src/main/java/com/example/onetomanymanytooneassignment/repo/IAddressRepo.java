package com.example.onetomanymanytooneassignment.repo;

import com.example.onetomanymanytooneassignment.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer> {
}
