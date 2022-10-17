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
@Table(name= "equipe" )
public class Equipe {
    @Id
    @Column(name= "id" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipe;

    @Column(name= "name" , length=128, nullable=false)
    private String nomEquip;

    @Column(name= "niveau" , length=128, nullable=false)
    private Niveau niveau;

    @OneToOne
    private DetailEquipe detailEquipe ;

    @ManyToMany (mappedBy = "equipes")
    private Set<Etudiant> etudiants;
//
//    public Equipe() {
//    }
//
//    public Equipe(int idEquipe, String nomEquip, Niveau niveau) {
//        this.idEquipe = idEquipe;
//        this.nomEquip = nomEquip;
//        this.niveau = niveau;
//    }
//
//    public int getIdEquipe() {
//        return idEquipe;
//    }
//
//    public void setIdEquipe(int idEquipe) {
//        this.idEquipe = idEquipe;
//    }
//
//    public String getNomEquip() {
//        return nomEquip;
//    }
//
//    public void setNomEquip(String nomEquip) {
//        this.nomEquip = nomEquip;
//    }
//
//    public Niveau getNiveau() {
//        return niveau;
//    }
//
//    public void setNiveau(Niveau niveau) {
//        this.niveau = niveau;
//    }
//
//    @Override
//    public String toString() {
//        return "Equipe{" +
//                "idEquipe=" + idEquipe +
//                ", nomEquip='" + nomEquip + '\'' +
//                ", niveau=" + niveau +
//                '}';
//    }
}
