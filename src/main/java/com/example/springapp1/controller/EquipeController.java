package com.example.springapp1.controller;

import com.example.springapp1.entity.Equipe;
import com.example.springapp1.service.IEquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EquipeController {

    private final IEquipeService iEquipeService;

    @Autowired
    public EquipeController(IEquipeService iEquipeService) {
        this.iEquipeService = iEquipeService;
    }

    @GetMapping("/getEquipes")
    List<Equipe> getAllEquipes(){
        return iEquipeService.getAllEquipes();
    }

    @GetMapping("/getEquipe/{equipeId}")
    Equipe getEquipeById(@PathVariable("equipeId") Long equipeId){
        return  iEquipeService.getEquipeById(equipeId);
    }

    @PostMapping("/addEquipe")
    void addEquipe(@RequestBody Equipe equipe){

        iEquipeService.addEquipe(equipe);
    }

    @DeleteMapping("/deleteEquipe")
    void deleteEquipe(@RequestBody Equipe equipe){
        iEquipeService.deleteEquipe(equipe);
    }

    @DeleteMapping("/deleteEquipe/{equipeId}")
    void deleteEquipe(@PathVariable("equipeId") Long equipeId){
        iEquipeService.deleteEquipeById(equipeId);
    }

    @PutMapping("/updateEquipe/{equipeId}")
    void updateEquipe(@PathVariable("equipeId") Long equipeId, @RequestBody Equipe equipe){
        iEquipeService.updateEquipe(equipeId, equipe);
    }
}