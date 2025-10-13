package com.example.fraykhalil4sae10.model;


import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;
    private long capaciteBloc;

    @ManyToOne
     Foyer foyer;

    @OneToMany(mappedBy = "bloc")
     List<Chambre> chambres;
}