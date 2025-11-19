package com.example.fraykhalil4sae10.repository;

import com.example.fraykhalil4sae10.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    @Query("SELECT e FROM Etudiant e WHERE e.nomEt = :nom")
    List<Etudiant> findByNom(@Param("nom") String nom);


    @Query(value = "SELECT * FROM etudiant WHERE ecole = :ecole", nativeQuery = true)
    List<Etudiant> findEtudiantsByEcoleNative(@Param("ecole") String ecole);
}
