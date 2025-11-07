package com.example.fraykhalil4sae10.repository;

import com.example.fraykhalil4sae10.model.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UniversityRepository extends JpaRepository<Universite,Long> {
    List<Universite> findByNomUniversiteContains(String nomUniversite);
}
