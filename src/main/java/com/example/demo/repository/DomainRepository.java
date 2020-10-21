package com.example.demo.repository;

import com.example.demo.model.Domain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DomainRepository extends JpaRepository<Domain, Long> {

    Optional<Domain> findById (Long id);

    @Query(value = "SELECT * FROM domain WHERE domain_name=:name", nativeQuery = true)
    Domain findByName(@Param("name") String name);
}
