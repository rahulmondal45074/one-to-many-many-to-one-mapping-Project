package com.example.onetomanymanytooneassignment.service;

import com.example.onetomanymanytooneassignment.model.Address;
import com.example.onetomanymanytooneassignment.model.User;
import com.example.onetomanymanytooneassignment.repo.IAddressRepo;
import com.example.onetomanymanytooneassignment.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;

    @Autowired
    IUserRepo iUserRepo;
    public String addAddresses(List<Address> newAddress) {
        for(Address address : newAddress){
            User user=address.getUser();
            iUserRepo.save(user);
            iAddressRepo.save(address);
        }
//        iAddressRepo.saveAll(newAddress);
        return "Address a re added";
    }

    public List<Address> getAllAddress() {
        return iAddressRepo.findAll();
    }
}
