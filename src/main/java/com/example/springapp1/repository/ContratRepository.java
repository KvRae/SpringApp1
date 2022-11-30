package com.example.springapp1.repository;

import com.example.springapp1.entity.Contrat;
import com.example.springapp1.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContratRepository extends JpaRepository<Contrat, Long> {

    @Query("select c from Contrat c where c.etudiant = ?1")
    List<Contrat> findContratByEtudiant(Etudiant etudiant);
}
