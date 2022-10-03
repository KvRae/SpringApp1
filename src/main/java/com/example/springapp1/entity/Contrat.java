package com.example.springapp1.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name= "contrat" )
public class Contrat {

    @Id
    @Column(name= "id" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat;

    @Column(name= "date_debut" , nullable=false)
    private Date dateDebutContrat;

    @Column(name= "date_fin" , nullable=false)
    private Date dateFinContrat;

    @Column(name= "specialite" , length=128, nullable=false)
    private Specialite specialite;

    @Column(name= "archive" , nullable=false)
    private Boolean archive ;

    public Contrat() {
    }

    public Contrat(int idContrat, Date dateDebutContrat, Date dateFinContrat, Specialite specialite, Boolean archive) {
        this.idContrat = idContrat;
        this.dateDebutContrat = dateDebutContrat;
        this.dateFinContrat = dateFinContrat;
        this.specialite = specialite;
        this.archive = archive;
    }

    public int getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(int idContrat) {
        this.idContrat = idContrat;
    }

    public Date getDateDebutContrat() {
        return dateDebutContrat;
    }

    public void setDateDebutContrat(Date dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public Date getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(Date dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    @Override
    public String toString() {
        return "Contrat{" +
                "idContrat=" + idContrat +
                ", dateDebutContrat=" + dateDebutContrat +
                ", dateFinContrat=" + dateFinContrat +
                ", specialite=" + specialite +
                ", archive=" + archive +
                '}';
    }
}

