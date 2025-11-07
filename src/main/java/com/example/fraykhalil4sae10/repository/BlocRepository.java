package com.example.fraykhalil4sae10.repository;

import com.example.fraykhalil4sae10.model.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
    Bloc findByNomBloc(String nomBloc);

    List<Bloc> findByNomBlocContaining(String nomPart);

    List<Bloc> findByCapaciteBlocLessThan(long capacite);

    List<Bloc> findByCapaciteBlocBetween(long min, long max);
}
