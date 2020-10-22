package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "company")
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

    @ManyToMany
    @JoinTable(
            name = "company_domain",
            joinColumns = @JoinColumn(name = "company_id"),
            inverseJoinColumns = @JoinColumn(name = "domain_id")
    )
    private Set<Domain> domanins = new HashSet<>();

    public Company(String companyName, String region, String city, String street, String zipCode, Set<Domain> domanis) {
        this.companyName = companyName;
        this.region = region;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
        this.domanins = domanis;
    }
}
