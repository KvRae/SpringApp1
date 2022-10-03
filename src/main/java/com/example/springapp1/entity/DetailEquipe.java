package com.example.springapp1.entity;
import javax.persistence.*;

@Entity
@Table(name= "detail_equipe" )
public class DetailEquipe {
    @Id
    @Column(name= "id" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salle ;

    @Column(name= "name" , length=128, nullable=false)
    private String thematique ;

    public DetailEquipe() {
    }

    public DetailEquipe(int salle, String thematique) {
        this.salle = salle;
        this.thematique = thematique;
    }

    public int getSalle() {
        return salle;
    }

    public void setSalle(int salle) {
        this.salle = salle;
    }

    public String getThematique() {
        return thematique;
    }

    public void setThematique(String thematique) {
        this.thematique = thematique;
    }

    @Override
    public String toString() {
        return "DetailEquipe{" +
                "salle=" + salle +
                ", thematique='" + thematique + '\'' +
                '}';
    }
}
