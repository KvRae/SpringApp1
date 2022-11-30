package com.example.springapp1.service;

import com.example.springapp1.entity.Departement;
import com.example.springapp1.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartementService implements IDepartementService{

    private final DepartementRepository departementRepository;

    public DepartementService(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }

    @Override
    public void addDepartement(Departement departement) {
        // TODO checking departement !existence before inserting
        Optional<Departement> departementToAdd = departementRepository.findDepartementByNomDepart(departement.getNomDepart());
        if (departementToAdd.isPresent()) throw new IllegalStateException("Departement " + departement.getNomDepart() + " already exist");
        departementRepository.save(departement);
    }

    @Override
    @Transactional
    public void updateDepartement(Long departementId, Departement departement) {
        Departement departementToUpdate = getDepartementById(departementId);
        if (departementToUpdate != null){
            if (departement != null && departement.getNomDepart().length() > 0 && !Objects.equals(departementToUpdate.getNomDepart(), departement.getNomDepart()))
                departementToUpdate.setNomDepart(departement.getNomDepart());
        }
        else throw new IllegalStateException("Departement with id " + departementId + " does not exist");
    }

    @Override
    public void deleteDepartement(Departement departement) {
        Optional<Departement> departementToAdd = departementRepository.findDepartementByNomDepart(departement.getNomDepart());
        if (departementToAdd.isPresent()) throw new IllegalStateException("Departement " + departement.getNomDepart() + " does not exist");
        departementRepository.delete(departement);
    }

    @Override
    public void deleteDepartementById(Long departementId) {
        Departement departementToDelete = getDepartementById(departementId);
        if (departementToDelete != null) departementRepository.deleteById(departementId);
        else throw new IllegalStateException("Departement with id " + departementId + " does not exist");

    }

    @Override
    public List<Departement> getAllDepartements() {
        return departementRepository.findAll();
    }

    @Override
    public Departement getDepartementById(Long departementId) {
        return departementRepository.findById(departementId)
                .orElseThrow(() -> new IllegalStateException("Departement does not exist"));
    }
}
