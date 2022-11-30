package com.example.springapp1.service;

import com.example.springapp1.entity.Contrat;
import com.example.springapp1.entity.Departement;
import com.example.springapp1.entity.Etudiant;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Repository
public interface IEtudiantService {
    void addEtudiant(Etudiant etudiant);
    void updateEtudiant(Long etudiantId, Etudiant etudiant);
    void deleteEtudiant(Etudiant etudiant);
    void deleteEtudiantById(Long etudiantId);
    List<Etudiant> getAllEtudiants();
    Etudiant getEtudiantById(Long etudiantId);
    void assignEtudiantToDepartement (Long etudiantId, Long departementId) ;
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant etudiant, Long idContrat, Long
            idEquipe);
    List<Etudiant> getEtudiantsByDepartement (Long idDepartement);

    Departement ShowDepartementEtudiantDetails(Long departementId);

    List<Contrat> getAllContratByIdEtudiant(Long idEtudiant);
}
