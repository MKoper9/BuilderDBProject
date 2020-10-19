package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "domain")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "domain")
public class Domain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "domain_id")
    private Long domainId;
    @Column(name = "domain_name")
    private String domainName;

    public Domain(String domainName) {
        this.domainName = domainName;
    }
}
