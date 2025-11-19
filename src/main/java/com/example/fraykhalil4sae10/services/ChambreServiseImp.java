package com.example.fraykhalil4sae10.services;


import com.example.fraykhalil4sae10.model.Chambre;
import com.example.fraykhalil4sae10.model.TypeChambre;
import com.example.fraykhalil4sae10.repository.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //class contunir un logique mitere w rahi class hedhi implimentaion mta3 servises bech ya3mel l bean
public class ChambreServiseImp implements IchambreServise {

    @Autowired // t3awedh private ChambreRepository c =new ChambreRepository() tasna3lek enstense wyanjektiha fi ay blasa  enstense hedhika esmha bean
    private ChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public Chambre getChambreById(Long id) {
        return chambreRepository.findById(id).orElse(null);

    }

    @Override
    public List<Chambre> allchambre() {
        return chambreRepository.findAll();
    }

    @Override
    public List<Chambre> findByNumeroChambreAndTypechambre(long numero, TypeChambre type) {
        return chambreRepository.findByNumeroChambreAndTypechambre(numero, type);
    }

    @Override
    public List<Chambre> findByNumeroChambreOrTypechambre(long numero, TypeChambre type) {
        return chambreRepository.findByNumeroChambreOrTypechambre(numero, type);
    }


    @Override
    public List<Chambre> findByNumeroChambreGreaterThan(long numero) {
        return chambreRepository.findByNumeroChambreGreaterThan(numero);
    }

    @Override
    public List<Chambre> findByNumeroChambreBetween(long min, long max) {
        return chambreRepository.findByNumeroChambreBetween(min, max);
    }
    @Override
    public List<Chambre> findByTypeStartingWith(String prefix) {
        return chambreRepository.findByTypechambreStartingWith(prefix);
    }


    @Override
    public List<Chambre> getChambresByTypeAndBloc(TypeChambre type, String nomBloc) {
        return chambreRepository.findChambresByTypeAndBloc(type, nomBloc);
    }

    @Override
    public List<Chambre> getChambresDisponiblesNative() {
        return chambreRepository.findChambresDisponiblesNative();
    }
}
