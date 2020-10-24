package com.example.demo.repository;

import com.example.demo.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    @Query(value = "SELECT * FROM company WHERE company_name =:name",nativeQuery = true)
    Company findByName(@Param("name") String name);

    @Query(value = "SELECT * FROM company JOIN domain ON company_id = domain_id WHERE domain_id =:id", nativeQuery = true)
    Set<Company> findAllByDomainId(@Param("id")Integer id);


}
