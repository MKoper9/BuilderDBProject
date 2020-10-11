package com.example.demo.repository;

import com.example.demo.model.ConstructionCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConstructionCompanyRepository extends JpaRepository<ConstructionCompany, Long> {

    Optional<ConstructionCompany> findById(Long id);

}
