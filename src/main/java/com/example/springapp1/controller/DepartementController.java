package com.example.springapp1.controller;

import com.example.springapp1.entity.Departement;
import com.example.springapp1.service.IDepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class DepartementController {

    private final IDepartementService iDepartementService;

    @Autowired
    public DepartementController(IDepartementService iDepartementService) {
        this.iDepartementService = iDepartementService;
    }

    @GetMapping("/getDepartements")
    List<Departement> getAllDepartements(){
        return iDepartementService.getAllDepartements();
    }

    @GetMapping("/getDepartement/{departementId}")
    Departement getDepartementById(@PathVariable("departementId") Long departementId){
        return  iDepartementService.getDepartementById(departementId);
    }

    @PostMapping("/addDepartement")
    void addDepartement(@RequestBody Departement departement){
        iDepartementService.addDepartement(departement);
    }

    @DeleteMapping("/deleteDepartement")
    void deleteDepartement(@RequestBody Departement departement){
        iDepartementService.deleteDepartement(departement);
    }

    @DeleteMapping("/deleteDepartement/{departementId}")
    void deleteDepartement(@PathVariable("departementId") Long departementId){
        iDepartementService.deleteDepartementById(departementId);
    }

    @PutMapping("/updateDepartement/{departementId}")
    void updateDepartement(@PathVariable("departementId") Long departementId, @RequestBody Departement departement){
        iDepartementService.updateDepartement(departementId, departement);
    }

}

