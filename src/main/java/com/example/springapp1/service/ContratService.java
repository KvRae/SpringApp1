package com.example.springapp1.service;


import com.example.springapp1.entity.Contrat;
import com.example.springapp1.entity.Etudiant;
import com.example.springapp1.repository.ContratRepository;
import com.example.springapp1.repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class ContratService implements IContratService {
    private final ContratRepository contratRepository;
    private final EtudiantRepository etudiantRepository;

    @Override
    public void addContrat(Contrat contrat) {
        // TODO checking contrat !existence before inserting
        contratRepository.save(contrat);
    }

    @Override
    public void updateContrat(Long contratId, Contrat contrat) {
        Contrat contratToUpdate = getContratById(contratId);
        if (contratToUpdate != null){
            if (contrat != null && !Objects.equals(contratToUpdate, contrat)){
                contratToUpdate.setMontantContrat(contrat.getMontantContrat());
                contratToUpdate.setDateDebutContrat(contrat.getDateDebutContrat());
                contratToUpdate.setDateFinContrat(contrat.getDateFinContrat());
                contratToUpdate.setArchive(contrat.isArchive());
                contratToUpdate.setSpecialite(contrat.getSpecialite());
                contratRepository.save(contratToUpdate);
            }
        }
        else throw new IllegalStateException("Contrat with id " + contratId + " does not exist");
    }

    @Override
    public void deleteContrat(Contrat contrat) {
        // TODO checking contrat existence before deleting
        contratRepository.delete(contrat);
    }

    @Override
    public void deleteContratById(Long contratId) {
        // TODO checking contrat existence before deleting
        contratRepository.deleteById(contratId);
    }

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat getContratById(Long contratId) {
        return contratRepository.findById(contratId)
                .orElseThrow(() -> new IllegalStateException("Contrat does not exist"));
    }

    @Override
    public Contrat affectContratToEtudiant(Contrat contrat, String nomEtudiant, String prenomEtudiant) {
        Etudiant etudiant = etudiantRepository.findEtudiantByNomEAndPrenomE(nomEtudiant, prenomEtudiant)
                .orElse(null);
        if (contrat != null && etudiant.getContrats().size() < 6){
            contrat.setEtudiant(etudiant);
            return contratRepository.save(contrat);
        }
        throw new IllegalStateException("Contrat does not exist or Etudiant has already 5 Contrats ");
    }
}



