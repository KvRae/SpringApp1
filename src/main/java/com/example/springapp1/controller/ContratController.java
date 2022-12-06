package com.example.springapp1.controller;

import com.example.springapp1.entity.Contrat;
import com.example.springapp1.service.IContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContratController {

    private final IContratService iContratService;

    @Autowired
    public ContratController(IContratService iContratService) {
        this.iContratService = iContratService;
    }

    @GetMapping("/getContrats")
    List<Contrat> getAllContrats(){
        return iContratService.getAllContrats();
    }

    @GetMapping("/getContrat/{contratId}")
    Contrat getContratById(@PathVariable("contratId") Long contratId){
        return iContratService.getContratById(contratId);
    }

    @PostMapping("/addContrat")
    void addContrat(@RequestBody Contrat contrat){
        iContratService.addContrat(contrat);
    }

    @DeleteMapping("/deleteContrat")
    void deleteContrat(@RequestBody Contrat contrat){
        iContratService.deleteContrat(contrat);
    }

    @DeleteMapping("/deleteContrat/{contratId}")
    void deleteContratById(@PathVariable("contratId") Long contratId){
        iContratService.deleteContratById(contratId);
    }

    @PutMapping("/updateContrat/{contratId}")
    void updateContrat(@PathVariable("contratId") Long contratId, @RequestBody Contrat contrat){
        iContratService.updateContrat(contratId, contrat);
    }

    @PutMapping("/affectContratToEtudiant/{nomEtudiant}/{prenomEtudiant}")
    Contrat affectContratToEtudiant(@RequestBody Contrat contrat,
                                    @PathVariable("nomEtudiant") String nomEtudiant,
                                    @PathVariable("prenomEtudiant") String prenomEtudiant
    ){
        return iContratService.affectContratToEtudiant(contrat, nomEtudiant, prenomEtudiant);
    }

}
