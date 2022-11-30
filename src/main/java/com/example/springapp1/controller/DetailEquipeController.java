package com.example.springapp1.controller;

import com.example.springapp1.entity.DetailEquipe;
import com.example.springapp1.service.IDetailEquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class DetailEquipeController {
    private final IDetailEquipeService iDetailEquipeService;

    @Autowired
    public DetailEquipeController(IDetailEquipeService iDetailEquipeService) {
        this.iDetailEquipeService = iDetailEquipeService;
    }

    @GetMapping("/getDetailEquipes")
    List<DetailEquipe> getAllDetailEquipes(){
        return iDetailEquipeService.getAllDetailEquipes();
    }

    @GetMapping("/getDetailEquipe/{detailEquipeId}")
    DetailEquipe getDetailEquipeById(@PathVariable("detailEquipeId") Long DetailEquipeId){
        return  iDetailEquipeService.getDetailEquipeById(DetailEquipeId);
    }

    @PostMapping("/addDetailEquipe")
    void addDetailEquipe(@RequestBody DetailEquipe DetailEquipe){
        iDetailEquipeService.addDetailEquipe(DetailEquipe);
    }

    @DeleteMapping("/deleteDetailEquipe")
    void deleteDetailEquipe(@RequestBody DetailEquipe DetailEquipe){
        iDetailEquipeService.deleteDetailEquipe(DetailEquipe);
    }

    @DeleteMapping("/deleteDetailEquipe/{detailEquipeId}")
    void deleteDetailEquipe(@PathVariable("detailEquipeId") Long DetailEquipeId){
        iDetailEquipeService.deleteDetailEquipeById(DetailEquipeId);
    }

    @PutMapping("/updateDetailEquipe/{detailEquipeId}")
    void updateDetailEquipe(@PathVariable("detailEquipeId") Long detailEquipeId, @RequestBody DetailEquipe DetailEquipe){
        iDetailEquipeService.updateDetailEquipe(detailEquipeId, DetailEquipe);
    }

}
