package com.example.onetomanymanytooneassignment.controller;

import com.example.onetomanymanytooneassignment.model.Address;
import com.example.onetomanymanytooneassignment.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("addresses")
    public  String addAddresses(@RequestBody List<Address> newAddress){
        return addressService.addAddresses(newAddress);
    }

    @GetMapping("address")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
}
