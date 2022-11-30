package com.example.springapp1.service;

import com.example.springapp1.entity.Departement;
import com.example.springapp1.entity.Universite;
import com.example.springapp1.repository.DepartementRepository;
import com.example.springapp1.repository.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService{

    private final UniversiteRepository universiteRepository;
    private final DepartementRepository departementRepository;
    @Override
    public void addUniversite(Universite universite) {
        // TODO checking universite !existence before inserting
        universiteRepository.save(universite);
    }

    @Override
    public void updateUniversite(Long universiteId, Universite universite) {
        // TODO checking universite existence before updating
        Universite universiteToUpdate = getUniversiteById(universiteId);
        if (universiteToUpdate != null){
            if (universite != null && !Objects.equals(universiteToUpdate, universite)){
                universiteToUpdate.setNomUniv(universite.getNomUniv());
                universiteRepository.save(universite);
            }
        }
        else throw new IllegalStateException("Univeriste with id " + universiteId + " does not exist");

    }

    @Override
    public void deleteUniversite(Universite universite) {
        // TODO checking universite existence before deleting
        universiteRepository.delete(universite);
    }

    @Override
    public void deleteUniversiteById(Long universiteId) {
        // TODO checking universite existence before deleting
        universiteRepository.deleteById(universiteId);
    }

    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite getUniversiteById(Long universiteId) {
        return universiteRepository.findById(universiteId)
                .orElseThrow(() -> new IllegalStateException("Universite with id " + universiteId + " does not exist"));
    }
    @Override
    public void assignUniversiteToDepartement(Long idUniversite, Long idDepartement) {
        Optional<Departement> optionalDepartement = departementRepository.findById(idDepartement);
        Optional<Universite> optionalUniversite = universiteRepository.findById(idUniversite);
        if(optionalUniversite.isPresent()&& optionalDepartement.isPresent()){
            Set<Departement> departements = optionalUniversite.get().getDepartements();
            departements.add(optionalDepartement.get());
            universiteRepository.save(optionalUniversite.orElse(null));
        }
    }
    @Override
    public List<Departement> retrieveDepartementsByUniversite(Long idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite).orElseThrow(() -> new IllegalStateException("University with id " + idUniversite +  "does not exist"));
        return universite.getDepartements().stream().collect(Collectors.toList());}

}

