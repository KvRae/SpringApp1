package com.example.springapp1.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant")
    private Long idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;
    @ManyToOne
    Departement departement;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etudiant")
    private Set<Contrat> contrats;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipe> equipes;

}