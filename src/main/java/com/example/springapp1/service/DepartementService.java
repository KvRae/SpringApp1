package com.example.springapp1.service;

import com.example.springapp1.entity.Departement;
import com.example.springapp1.repository.DepartementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartementService implements IDepartementService{

    private final DepartementRepository departementRepository;

    public DepartementService(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }

    @Override
    public void addDepartement(Departement departement) {

    }

    @Override
    public void updateDepartement(Long departementId, Departement departement) {

    }

    @Override
    public void deleteDepartement(Departement departement) {

    }

    @Override
    public void deleteDepartementById(Long departementId) {

    }

    @Override
    public List<Departement> getAllDepartements() {
        return null;
    }

    @Override
    public Departement getDepartementById(Long departementId) {
        return null;
    }
}
