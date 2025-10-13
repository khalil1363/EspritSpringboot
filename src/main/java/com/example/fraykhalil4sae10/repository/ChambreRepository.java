package com.example.fraykhalil4sae10.repository;

import com.example.fraykhalil4sae10.model.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ChambreRepository  extends JpaRepository<Chambre,Long> {
}
