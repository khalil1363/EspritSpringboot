package com.example.fraykhalil4sae10.services;

import com.example.fraykhalil4sae10.model.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    Universite updateUniversite( Universite universite);
    void deleteUniversite(Long id);
    Universite getUniversiteById(Long id);
    List<Universite> allUniversites();
}