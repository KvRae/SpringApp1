package com.example.springapp1.repository;

import com.example.springapp1.entity.Contract;
import com.example.springapp1.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContractRepository extends JpaRepository<Contract, Long> {

    @Query("select c from Contract c where c.etudiant = ?1")
    List<Contract> findContratByEtudiant(Etudiant etudiant);
}
