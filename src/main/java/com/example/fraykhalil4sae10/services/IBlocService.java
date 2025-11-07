package com.example.fraykhalil4sae10.services;

import com.example.fraykhalil4sae10.model.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc( Bloc bloc);
    void deleteBloc(Long id);
    Bloc getBlocById(Long id);
    List<Bloc> allBlocs();
    Bloc findByNomBloc(String nomBloc);
    List<Bloc> findByNomBlocContaining(String nomPart);
    List<Bloc> findByCapaciteBlocLessThan(long capacite);
    List<Bloc> findByCapaciteBlocBetween(long min, long max);
}