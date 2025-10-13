    package com.example.fraykhalil4sae10.model;

    import jakarta.persistence.*;
    import lombok.*;
    import java.util.List;

    @Entity
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class Foyer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idFoyer;

        private String nomFoyer;
        private long capaciteFoyer;

        @OneToOne(mappedBy = "foyer")
        Universite Universite;
        @OneToMany(mappedBy = "foyer")
         List<Bloc> blocs;
    }

