package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConstructionCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;
    private String companyName;
    private String region;
    private String city;
    private String street;
    private String zipCode;

    public ConstructionCompany(String companyName, String region, String city, String street, String zipCode) {
        this.companyName = companyName;
        this.region = region;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }
}
