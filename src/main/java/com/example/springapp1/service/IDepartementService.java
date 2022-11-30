package com.example.springapp1.service;

import com.example.springapp1.entity.Departement;

import java.util.List;

public interface IDepartementService {
    void addDepartement(Departement departement);
    void updateDepartement(Long departementId, Departement departement);
    void deleteDepartement(Departement departement);
    void deleteDepartementById(Long departementId);
    List<Departement> getAllDepartements();
    Departement getDepartementById(Long departementId);
}
