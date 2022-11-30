package com.example.springapp1.service;

import com.example.springapp1.entity.Equipe;
import com.example.springapp1.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EquipeService implements IEquipeService{

    private final EquipeRepository equipeRepository;

    @Autowired
    public EquipeService(EquipeRepository equipeRepository) {
        this.equipeRepository = equipeRepository;
    }

    @Override
    public void addEquipe(Equipe equipe) {

    }

    @Override
    public void updateEquipe(Long equipeId, Equipe equipe) {

    }

    @Override
    public void deleteEquipe(Equipe equipe) {

    }

    @Override
    public void deleteEquipeById(Long equipeId) {

    }

    @Override
    public List<Equipe> getAllEquipes() {
        return null;
    }

    @Override
    public Equipe getEquipeById(Long equipeId) {
        return null;
    }
}
