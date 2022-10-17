package com.example.springapp1.entity;

import lombok.*;


import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

@Entity
@Table(name= "departement" )

public class Departement {

    @Id
    @Column(name= "id" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepartement;

    @Column(name= "name" , length=128, nullable=false)
    private String nomDepart;

    @OneToMany
    private Set<Etudiant> etudiants;

//
//    public Departement() {
//    }
//
//    public Departement(int idDepartement, String nomDepart) {
//        this.idDepartement = idDepartement;
//        this.nomDepart = nomDepart;
//    }
//
//    public int getIdDepartement() {
//        return idDepartement;
//    }
//
//    public void setIdDepartement(int idDepartement) {
//        this.idDepartement = idDepartement;
//    }
//
//    public String getNomDepart() {
//        return nomDepart;
//    }
//
//    public void setNomDepart(String nomDepart) {
//        this.nomDepart = nomDepart;
//    }
//
//    @Override
//    public String toString() {
//        return "Departement{" +
//                "idDepartement=" + idDepartement +
//                ", nomDepart='" + nomDepart + '\'' +
//                '}';
//    }
}
