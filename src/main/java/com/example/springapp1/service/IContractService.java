package com.example.springapp1.service;

import com.example.springapp1.entity.Contract;

import java.util.List;

public interface IContractService  {
    void addContrat(Contract contrat);
    void updateContrat(Long contratId, Contract contrat);
    void deleteContrat(Contract contrat);
    void deleteContratById(Long contratId);
    List<Contract> getAllContrats();
    Contract getContratById(Long contratId);
    Contract affectContratToEtudiant(Contract contrat, String nomEtudiant, String prenomEtudiant);
}
