package com.example.springapp1.controller;

import com.example.springapp1.entity.Contract;
import com.example.springapp1.service.IContractService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/contract")
@RestController
public class ContractController implements IContractService {

    @GetMapping("/retrieve-all")
    @ResponseBody
    public String retrieveAll() {
        return "retrieve all";
    }

    @GetMapping("/retrieve-one")
    @ResponseBody
    public String retrieveOne() {
        return "retrieve one";
    }

    @PostMapping("/create")
    @ResponseBody
    public String create() {
        return "create";
    }

    @PutMapping("/update")
    @ResponseBody
    public String update() {
        return "update";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "delete";
    }




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
