package com.example.fraykhalil4sae10.services;

import com.example.fraykhalil4sae10.model.Etudiant;
import com.example.fraykhalil4sae10.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantServiceImp implements IEtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant( Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant getEtudiantById(Long id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Etudiant> allEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public List<Etudiant> getByNom(String nom) {
        return etudiantRepository.findByNom(nom);
    }


    @Override
    public List<Etudiant> getEtudiantsByEcoleNative(String ecole) {
        return etudiantRepository.findEtudiantsByEcoleNative(ecole);
    }
}