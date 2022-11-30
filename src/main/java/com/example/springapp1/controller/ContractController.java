package com.example.springapp1.controller;

import com.example.springapp1.entity.Contrat;
import com.example.springapp1.service.IContratService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/contract")
@RestController
public class ContractController implements IContratService {

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
    public void addContrat(Contrat contrat) {

    }

    @Override
    public void updateContrat(Long contratId, Contrat contrat) {

    }

    @Override
    public void deleteContrat(Contrat contrat) {

    }

    @Override
    public void deleteContratById(Long contratId) {

    }

    @Override
    public List<Contrat> getAllContrats() {
        return null;
    }

    @Override
    public Contrat getContratById(Long contratId) {
        return null;
    }

    @Override
    public Contrat affectContratToEtudiant(Contrat contrat, String nomEtudiant, String prenomEtudiant) {
        return null;
    }
}
