package com.example.fraykhalil4sae10.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private long numeroChambre ;

    @Enumerated(EnumType.STRING)
    private TypeChambre typechambre;


    @OneToMany
    private List<Reservation> reservations;

    @ManyToOne
    private Bloc bloc;








}
