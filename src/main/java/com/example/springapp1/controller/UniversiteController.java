package com.example.springapp1.controller;
import com.example.springapp1.entity.Departement;
import com.example.springapp1.entity.Universite;
import com.example.springapp1.service.IUniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UniversiteController {
    private final IUniversiteService iUniversiteService;

    @Autowired
    public UniversiteController(IUniversiteService iUniversiteService) {
        this.iUniversiteService = iUniversiteService;
    }

    @GetMapping("/getUniversites")
    List<Universite> getAllUniversites(){
        return iUniversiteService.getAllUniversites();
    }

    @GetMapping("/getUniversite/{universiteId}")
    Universite getUniversiteById(@PathVariable("universiteId") Long universiteId){
        return  iUniversiteService.getUniversiteById(universiteId);
    }

    @PostMapping("/addUniversite")
    void addUniversite(@RequestBody Universite universite){
        iUniversiteService.addUniversite(universite);
    }

    @DeleteMapping("/deleteUniversite")
    void deleteUniversite(@RequestBody Universite universite){
        iUniversiteService.deleteUniversite(universite);
    }

    @DeleteMapping("/deleteUniversite/{universiteId}")
    void deleteUniversite(@PathVariable("universiteId") Long universiteId){
        iUniversiteService.deleteUniversiteById(universiteId);
    }

    @PutMapping("/updateUniversite/{universiteId}")
    void updateUniversite(@PathVariable("universiteId") Long universiteId, @RequestBody Universite universite){
        iUniversiteService.updateUniversite(universiteId, universite);
    }


    @PutMapping("/assignUniversiteToDepartement/{universiteId}/{departementId}")
    public void assignUniversiteToDepartement(@PathVariable("universiteId") Long universiteId,@PathVariable("departementId") Long departementId){
        iUniversiteService.assignUniversiteToDepartement(universiteId, departementId);
    }

    @GetMapping("/retreiveDepartementsByUniversity/{universityId}")
    List<Departement> getDepartementsByUniversite(@PathVariable("universityId") Long universityId){
        return iUniversiteService.retrieveDepartementsByUniversite(universityId);
    }
}
