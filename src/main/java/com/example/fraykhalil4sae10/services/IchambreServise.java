package com.example.fraykhalil4sae10.services;

import com.example.fraykhalil4sae10.model.Chambre;

import java.util.List;

public interface IchambreServise {
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(Long id);
    Chambre getChambreById(Long id);
    List <Chambre> allchambre();
}
