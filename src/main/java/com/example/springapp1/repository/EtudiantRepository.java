package com.example.springapp1.repository;

import com.example.springapp1.entity.Departement;
import com.example.springapp1.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    Optional<Etudiant> findEtudiantByNomEAndPrenomE(String nomEtudiant, String prenomEtudiant);

    @Query("select e from Etudiant e where e.departement = ?1")
    List<Etudiant> findEtudiantByDepartement(Departement departement);
}
