package com.example.onetomanymanytooneassignment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "fk_UserId")
    User user;

    @OneToMany
    @JoinColumn(name = "fk_orderId")
     List<Product> products;

    @ManyToOne
    @JoinColumn(name = "fk_addressId")
    Address address;

    private Integer productQuantity;


}
