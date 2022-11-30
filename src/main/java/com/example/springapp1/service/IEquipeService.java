package com.example.springapp1.service;

import com.example.springapp1.entity.Equipe;

import java.util.List;

public interface IEquipeService {
    void addEquipe(Equipe equipe);
    void updateEquipe(Long equipeId, Equipe equipe);
    void deleteEquipe(Equipe equipe);
    void deleteEquipeById(Long equipeId);
    List<Equipe> getAllEquipes();
    Equipe getEquipeById(Long equipeId);
}
