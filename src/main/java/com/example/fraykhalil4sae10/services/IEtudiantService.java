package com.example.fraykhalil4sae10.services;

import com.example.fraykhalil4sae10.model.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant( Etudiant etudiant);
    void deleteEtudiant(Long id);
    Etudiant getEtudiantById(Long id);
    List<Etudiant> allEtudiants();

    List<Etudiant> getByNom(String nom);



    List<Etudiant> getEtudiantsByEcoleNative(String ecole);
}