package com.example.fraykhalil4sae10.services;

import com.example.fraykhalil4sae10.model.Bloc;
import com.example.fraykhalil4sae10.repository.BlocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlocServiceImp implements IBlocService {

    @Autowired
    private BlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc( Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public Bloc getBlocById(Long id) {
        return blocRepository.findById(id).orElse(null);
    }

    @Override
    public List<Bloc> allBlocs() {
        return blocRepository.findAll();
    }
    @Override
    public Bloc findByNomBloc(String nomBloc) {
        return blocRepository.findByNomBloc(nomBloc);
    }

    @Override
    public List<Bloc> findByNomBlocContaining(String nomPart) {
        return blocRepository.findByNomBlocContaining(nomPart);
    }

    @Override
    public List<Bloc> findByCapaciteBlocLessThan(long capacite) {
        return blocRepository.findByCapaciteBlocLessThan(capacite);
    }
    public List<Bloc> findByCapaciteBlocBetween(long min, long max) {
        return blocRepository.findByCapaciteBlocBetween(min, max);
    }


}