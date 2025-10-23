package com.example.fraykhalil4sae10.services;


import com.example.fraykhalil4sae10.model.Chambre;
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

}
