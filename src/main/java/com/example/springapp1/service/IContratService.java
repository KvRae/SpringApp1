package com.example.springapp1.service;

import com.example.springapp1.entity.Contrat;

import java.util.List;

public interface IContratService  {
    void addContrat(Contrat contrat);
    void updateContrat(Long contratId, Contrat contrat);
    void deleteContrat(Contrat contrat);
    void deleteContratById(Long contratId);
    List<Contrat> getAllContrats();
    Contrat getContratById(Long contratId);
    Contrat affectContratToEtudiant(Contrat contrat, String nomEtudiant, String prenomEtudiant);
}
