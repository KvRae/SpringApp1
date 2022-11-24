package com.example.springapp1.service;


import com.example.springapp1.entity.Contrat;
import com.example.springapp1.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contracts")
public class ContractService implements IContractService {
    @Autowired
    private ContractRepository contractRepository;


    @Override
    public int addContract(int id, String name, String description, String dateDebut, String dateFin, int idEquipe) {
        if(contractRepository.existsById(id))
            return -1;
        else {
            Contrat contrat = new Contrat();
            contractRepository.save(contrat);
            return 1;
        }
    }

    @Override
    public boolean updateContract(int id, String name, String description, String dateDebut, String dateFin, int idEquipe) {
        if(contractRepository.existsById(id)) {
            Contrat contrat = new Contrat();
            contractRepository.save(contrat);
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean deleteContract(int id) {
        if(contractRepository.existsById(id)) {
            contractRepository.deleteById(id);
            return true;
        }
        else
            return false;
    }

    @Override
    public List<Contrat> getAllContracts() {
        return contractRepository.findAll();
    }

    @Override
    public Contrat getContractById(int id) {
        return contractRepository.findById(id).get();
    }
}

