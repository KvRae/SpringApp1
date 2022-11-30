package com.example.springapp1.controller;


import com.example.springapp1.entity.Etudiant;
import com.example.springapp1.service.IEtudiantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/etudiant")
@RestController
public class EtudiantController implements IEtudiantService {

    @Override
    public int addEtudiant(int id, String nom, String prenom, int idEquipe) {
        return 0;
    }

    @Override
    public boolean updateEtudiant(int id, String nom, String prenom, int idEquipe) {
        return false;
    }

    @Override
    public boolean deleteEtudiant(int id) {
        return false;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return null;
    }

    @Override
    public Etudiant getEtudiantById(int id) {
        return null;
    }
}
