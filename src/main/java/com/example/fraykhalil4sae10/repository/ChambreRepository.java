package com.example.fraykhalil4sae10.repository;

import com.example.fraykhalil4sae10.model.Chambre;
import com.example.fraykhalil4sae10.model.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepository  extends JpaRepository<Chambre,Long> {
    List<Chambre> findByNumeroChambreAndTypechambre(long numeroChambre, TypeChambre typeChambre);
    List<Chambre> findByNumeroChambreOrTypechambre(long numeroChambre, TypeChambre typeChambre);
    List<Chambre> findByNumeroChambreGreaterThan(long numero);
    List<Chambre> findByNumeroChambreBetween(long min, long max);
    List<Chambre> findByTypechambreStartingWith(String prefix);

    @Query("SELECT c FROM Chambre c WHERE c.typechambre = :type AND c.bloc.nomBloc = :nomBloc")
    List<Chambre> findChambresByTypeAndBloc(@Param("type") TypeChambre type, @Param("nomBloc") String nomBloc);



    @Query(value = "SELECT c.* FROM chambre c WHERE c.id_chambre NOT IN (SELECT r.chambre_id FROM reservation r WHERE r.est_valide = true)", nativeQuery = true)
    List<Chambre> findChambresDisponiblesNative();
}
