package com.example.springapp1.service;

import com.example.springapp1.entity.Etudiant;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Repository
public interface IEtudiantService {

    int addEtudiant(int id, String nom, String prenom, int idEquipe);
    boolean updateEtudiant(int id, String nom, String prenom, int idEquipe);
    boolean deleteEtudiant(int id);

    List<Etudiant> getAllEtudiants();
    Etudiant getEtudiantById(int id);
}
