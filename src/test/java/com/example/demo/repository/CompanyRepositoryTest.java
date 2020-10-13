package com.example.demo.repository;

import com.example.demo.model.Company;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class CompanyRepositoryTest {

    @Autowired
    private CompanyRepository companyRepository;


    //bad test
    @Test
    @Sql(statements = {"INSERT INTO company (company_id, company_name, region, city, street, zip_code) VALUES (1,\"AKIZ\", 'Kujawsko-Pomorskie', \"Bydgoszcz\", \"Czerwonego Krzyża 26\", \"85-333 Bydgoszcz\");"}
    )
    void findAllCompany(){
        //given
        //when
        List<Company>company = companyRepository.findAll();
        //then
        assertEquals(company.size(),1);
    }

}