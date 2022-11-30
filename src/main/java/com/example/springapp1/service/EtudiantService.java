package com.example.springapp1.service;

import com.example.springapp1.entity.Contrat;
import com.example.springapp1.entity.Departement;
import com.example.springapp1.entity.Equipe;
import com.example.springapp1.entity.Etudiant;
import com.example.springapp1.repository.ContratRepository;
import com.example.springapp1.repository.DepartementRepository;
import com.example.springapp1.repository.EquipeRepository;
import com.example.springapp1.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EtudiantService implements IEtudiantService {
    private final EtudiantRepository etudiantRepository;
    private final EquipeRepository equipeRepository;
    private final ContratRepository contratRepository;
    private final DepartementRepository departementRepository;

    @Autowired
    public EtudiantService(EtudiantRepository etudiantRepository, EquipeRepository equipeRepository, ContratRepository contratRepository, DepartementRepository departementRepository) {
        this.etudiantRepository = etudiantRepository;
        this.equipeRepository = equipeRepository;
        this.contratRepository = contratRepository;
        this.departementRepository = departementRepository;
    }

    @Override
    public void addEtudiant(Etudiant etudiant) {
        // TODO checking etudiant !existence before inserting
        etudiantRepository.save(etudiant);
    }

    @Override
    public void updateEtudiant(Long etudiantId, Etudiant etudiant) {
        // TODO checking etudiant existence before updating
        Etudiant etudiantToUpdate = getEtudiantById(etudiantId);
        if (etudiantToUpdate != null){
            if (etudiant != null && !Objects.equals(etudiantToUpdate, etudiant)){
                etudiantToUpdate.setNomE(etudiant.getNomE());
                etudiantToUpdate.setPrenomE(etudiant.getPrenomE());
                etudiantToUpdate.setOption(etudiant.getOption());
                etudiantRepository.save(etudiant);
            }
        }
        else throw new IllegalStateException("Etudiant with id " + etudiantId + " does not exist");

    }

    @Override
    public void deleteEtudiant(Etudiant etudiant) {
        // TODO checking etudiant existence before deleting
        etudiantRepository.delete(etudiant);
    }

    @Override
    public void deleteEtudiantById(Long etudiantId) {
        // TODO checking etudiant existence before deleting
        etudiantRepository.deleteById(etudiantId);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getEtudiantById(Long etudiantId) {
        return etudiantRepository.findById(etudiantId)
                .orElseThrow(() -> new IllegalStateException("Etudiant with id " + etudiantId + " does not exist"));
    }

    @Override
    public void assignEtudiantToDepartement(Long etudiantId, Long departementId) {

        Etudiant etudiant = etudiantRepository.findById(etudiantId).orElse(null);
        Departement departement = departementRepository.findById(departementId).orElse(null);
        etudiant.setDepartement(departement);
        etudiantRepository.save(etudiant);

    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant etudiant, Long idContrat, Long idEquipe) {
        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);

        etudiant.getEquipes().add(equipe);
        contrat.setEtudiant(etudiant);
        return   etudiantRepository.save(etudiant);


    }

    @Override
    public List<Etudiant> getEtudiantsByDepartement(Long idDepartement) {
        Departement departement = departementRepository.findById(idDepartement)
                .orElseThrow(() -> new IllegalStateException("Departement with id " + idDepartement +
                        " does not exist"));
        return etudiantRepository.findEtudiantByDepartement(departement);
    }

    @Override
    public Departement ShowDepartementEtudiantDetails(Long departementId) {
        return departementRepository.findById(departementId).
                orElseThrow(() -> new IllegalStateException("Departement with id " + departementId + " does not exist"));
    }

    @Override
    public List<Contrat> getAllContratByIdEtudiant(Long idEtudiant) {
        Etudiant etudiant = etudiantRepository.findById(idEtudiant).orElseThrow(() -> new IllegalStateException("Etudiant with id " + idEtudiant +
                " does not exist"));
        return contratRepository.findContratByEtudiant(etudiant);

    }

}

