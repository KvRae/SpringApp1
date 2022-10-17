package com.example.springapp1.entity;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode


@Entity
@Table(name= "etudiant" )
public class Etudiant {

    @Id
    @Column(name= "id" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant;

    @Column(name= "nom" , length=128, nullable=false)
    private String nom;

    @Column(name= "prenom" , length=128, nullable=false)
    private String prenom;

    @Column(name= "option")
    private Option option;

    @ManyToOne
    private Departement departement;

    @OneToMany
    private Set<Contrat> contrats;

    @ManyToMany
    private Set<Equipe> equipes;




//
//    public Etudiant() {
//    }
//
//    public Etudiant(int idEtudiant, String nom, String prenom, Option option) {
//        this.idEtudiant = idEtudiant;
//        this.nom = nom;
//        this.prenom = prenom;
//        this.option = option;
//    }
//
//    public int getIdEtudiant() {
//        return idEtudiant;
//    }
//
//    public void setIdEtudiant(int idEtudiant) {
//        this.idEtudiant = idEtudiant;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
//
//    public String getPrenom() {
//        return prenom;
//    }
//
//    public void setPrenom(String prenom) {
//        this.prenom = prenom;
//    }
//
//    public Option getOption() {
//        return option;
//    }
//
//    public void setOption(Option option) {
//        this.option = option;
//    }
//
//    @Override
//    public String toString() {
//        return "Etudiant{" +
//                "idEtudiant=" + idEtudiant +
//                ", nom='" + nom + '\'' +
//                ", prenom='" + prenom + '\'' +
//                ", option=" + option +
//                '}';
//    }
}
