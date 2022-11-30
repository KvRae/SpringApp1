package com.example.springapp1.service;

import com.example.springapp1.entity.Etudiant;
import com.example.springapp1.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class EtudiantService implements IEtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public int addEtudiant(int id, String name, String descriptionPRENOM, int idEquipe) {
        if(etudiantRepository.existsById((long) id))
            return -1;
        else {
            Etudiant etudiant = new Etudiant();
            etudiantRepository.save(etudiant);
            return 1;
        }
    }

    @Override
    public boolean updateEtudiant(int id, String name, String prenom, int idEquipe) {
        if(etudiantRepository.existsById((long) id)) {
            Etudiant etudiant = new Etudiant();
            etudiantRepository.save(etudiant);
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean deleteEtudiant(int id) {
        if(etudiantRepository.existsById((long) id)) {
            etudiantRepository.deleteById((long) id);
            return true;
        }
        else
            return false;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getEtudiantById(int id) {
        return etudiantRepository.findById((long) id).get();
    }
}
