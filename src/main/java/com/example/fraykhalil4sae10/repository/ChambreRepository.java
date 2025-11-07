package com.example.fraykhalil4sae10.repository;

import com.example.fraykhalil4sae10.model.Chambre;
import com.example.fraykhalil4sae10.model.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepository  extends JpaRepository<Chambre,Long> {
    List<Chambre> findByNumeroChambreAndTypechambre(long numeroChambre, TypeChambre typeChambre);
    List<Chambre> findByNumeroChambreOrTypechambre(long numeroChambre, TypeChambre typeChambre);
    List<Chambre> findByNumeroChambreGreaterThan(long numero);
    List<Chambre> findByNumeroChambreBetween(long min, long max);
    List<Chambre> findByTypechambreStartingWith(String prefix);
}
