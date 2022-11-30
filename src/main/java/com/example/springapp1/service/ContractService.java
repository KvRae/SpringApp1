package com.example.springapp1.service;


import com.example.springapp1.entity.Contract;
import com.example.springapp1.repository.ContractRepository;
import com.example.springapp1.repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@AllArgsConstructor
public class ContractService implements IContractService {
    private final ContractRepository contratRepository;
    private final EtudiantRepository etudiantRepository;


    @Override
    public void addContrat(Contract contrat) {

    }

    @Override
    public void updateContrat(Long contratId, Contract contrat) {

    }

    @Override
    public void deleteContrat(Contract contrat) {

    }

    @Override
    public void deleteContratById(Long contratId) {

    }

    @Override
    public List<Contract> getAllContrats() {
        return null;
    }

    @Override
    public Contract getContratById(Long contratId) {
        return null;
    }

    @Override
    public Contract affectContratToEtudiant(Contract contrat, String nomEtudiant, String prenomEtudiant) {
        return null;
    }
}


