package com.example.demo.repository;

import com.example.demo.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConstructionCompanyRepository extends JpaRepository<Company, Long> {

    Optional<Company> findById(Long id);

}
