package com.example.fraykhalil4sae10.services;

import com.example.fraykhalil4sae10.model.Chambre;
import com.example.fraykhalil4sae10.model.TypeChambre;

import java.util.List;

public interface IchambreServise {
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(Long id);
    Chambre getChambreById(Long id);
    List <Chambre> allchambre();
    List<Chambre> findByNumeroChambreAndTypechambre(long numero, TypeChambre type);
    List<Chambre> findByNumeroChambreOrTypechambre(long numero, TypeChambre type);
    List<Chambre> findByNumeroChambreGreaterThan(long numero);
    List<Chambre> findByNumeroChambreBetween(long min, long max);
    List<Chambre> findByTypeStartingWith(String prefix);
}
