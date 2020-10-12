package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "construction_company")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private Long companyId;
    @Column(name = "company_name")
    private String companyName;
    private String region;
    private String city;
    private String street;
    @Column(name = "zip_code")
    private String zipCode;

    public Company(String companyName, String region, String city, String street, String zipCode) {
        this.companyName = companyName;
        this.region = region;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }
}
