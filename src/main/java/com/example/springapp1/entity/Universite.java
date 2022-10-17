package com.example.springapp1.entity;




import lombok.*;


import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@EqualsAndHashCode

@Table(name = "universite")
public class Universite {
    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniv;

    @Column(name= "name" , length=128, nullable=false)
    private String nomUniv;
    @OneToMany()
    private Set<Departement> departements;
//
//    public Universite() {
//    }
//
//    public Universite(int idUniv, String nomUniv) {
//        this.idUniv = idUniv;
//        this.nomUniv = nomUniv;
//    }
//
//    public int getIdUniv() {
//        return idUniv;
//    }
//
//    public void setIdUniv(int idUniv) {
//        this.idUniv = idUniv;
//    }
//
//    public String getNomUniv() {
//        return nomUniv;
//    }
//
//    public void setNomUniv(String nomUniv) {
//        this.nomUniv = nomUniv;
//    }
//
//    @Override
//    public String toString() {
//        return "Universite{" +
//                "idUniv=" + idUniv +
//                ", nomUniv='" + nomUniv + '\'' +
//                '}';
//    }
}
