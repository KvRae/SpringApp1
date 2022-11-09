package com.example.springapp1.service;


import com.example.springapp1.entity.Contrat;

import java.util.List;

public interface IContractService  {

    int addContract(int id, String name, String description, String dateDebut, String dateFin, int idEquipe);
    boolean updateContract(int id, String name, String description, String dateDebut, String dateFin, int idEquipe);
    boolean deleteContract(int id);

    List<Contrat> getAllContracts();
    Contrat getContractById(int id);
}
