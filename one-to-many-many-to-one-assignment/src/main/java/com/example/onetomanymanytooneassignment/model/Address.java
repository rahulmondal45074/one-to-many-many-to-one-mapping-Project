package com.example.onetomanymanytooneassignment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addId;
    private String addName;
    private String addLandmark;
    private String addZipcode;
    private String addState;

    @OneToOne
    @JoinColumn(name = "fk_User")
    User user;

}
