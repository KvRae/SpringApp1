package com.example.springapp1.controller;


import com.example.springapp1.entity.Contrat;
import com.example.springapp1.entity.Departement;
import com.example.springapp1.entity.Etudiant;
import com.example.springapp1.service.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EtudiantController {
    private final IEtudiantService iEtudiantService;

    @Autowired
    public EtudiantController(IEtudiantService iEtudiantService) {
        this.iEtudiantService = iEtudiantService;
    }

    @GetMapping("/getEtudiants")
    List<Etudiant> getAllEtudiants(){
        return iEtudiantService.getAllEtudiants();
    }

    @GetMapping("/getEtudiant/{etudiantId}")
    Etudiant getEtudiantById(@PathVariable("etudiantId") Long etudiantId){
        return  iEtudiantService.getEtudiantById(etudiantId);
    }

    @PostMapping("/addEtudiant")
    void addEtudiant(@RequestBody Etudiant etudiant){
        iEtudiantService.addEtudiant(etudiant);
    }

    @DeleteMapping("/deleteEtudiant")
    void deleteEtudiant(@RequestBody Etudiant etudiant){
        iEtudiantService.deleteEtudiant(etudiant);
    }

    @DeleteMapping("/deleteEtudiant/{etudiantId}")
    void deleteEtudiant(@PathVariable("etudiantId") Long etudiantId){
        iEtudiantService.deleteEtudiantById(etudiantId);
    }

    @PutMapping("/updateEtudiant/{etudiantId}")
    void updateEtudiant(@PathVariable("etudiantId") Long etudiantId, @RequestBody Etudiant etudiant){
        iEtudiantService.updateEtudiant(etudiantId, etudiant);
    }

    @GetMapping("/getEtudiantsByDepartement/{departementId}")
    List<Etudiant> getEtudiantsByDepartement(@PathVariable("departementId") Long departementId){
        return iEtudiantService.getEtudiantsByDepartement(departementId);
    }

    @PutMapping("/assignEtudiantToDepartement/{etudiantId}/{departementId}")
    public void assignEtudiantToDepartement(@PathVariable("etudiantId") Long etudiantId,
                                            @PathVariable("departementId") Long departementId){
        iEtudiantService.assignEtudiantToDepartement(etudiantId,departementId);
    }

    @PostMapping("/addAndAssignEtudiantToEquipeAndContract/{idContrat}/{idEquipe}")
    Etudiant addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant etudiant,
                                                     @PathVariable("idContrat") Long idContrat,
                                                     @PathVariable("idEquipe") Long idEquipe
    )
    {
        return iEtudiantService.addAndAssignEtudiantToEquipeAndContract(etudiant,idContrat,idEquipe);
    }

    @GetMapping("/ShowDepartementEtudiantDetails/{departementId}")
    Departement ShowDepartementEtudiantDetails (@PathVariable("departementId") Long departementId)
    {
        return iEtudiantService.ShowDepartementEtudiantDetails(departementId);
    }
    @GetMapping("/getAllContratByIdEtudiant/{idEtudiant}")
    List<Contrat> getAllContratByIdEtudiant(@PathVariable("idEtudiant") Long idEtudiant)
    {
        return iEtudiantService.getAllContratByIdEtudiant(idEtudiant);
    }

}
