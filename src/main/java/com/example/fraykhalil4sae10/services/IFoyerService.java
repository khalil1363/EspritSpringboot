package com.example.fraykhalil4sae10.services;

import com.example.fraykhalil4sae10.model.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);
    Foyer updateFoyer( Foyer foyer);
    void deleteFoyer(Long id);
    Foyer getFoyerById(Long id);
    List<Foyer> allFoyers();
}