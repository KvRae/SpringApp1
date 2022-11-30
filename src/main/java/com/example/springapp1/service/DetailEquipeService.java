package com.example.springapp1.service;

import com.example.springapp1.entity.DetailEquipe;
import com.example.springapp1.repository.DetailEquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DetailEquipeService implements IDetailEquipeService {
    private final DetailEquipeRepository detailEquipeRepository;

    @Autowired
    public DetailEquipeService(DetailEquipeRepository detailEquipeRepository) {
        this.detailEquipeRepository = detailEquipeRepository;
    }

    @Override
    public void addDetailEquipe(DetailEquipe detailEquipe) {

    }

    @Override
    public void updateDetailEquipe(Long detailEquipeId, DetailEquipe detailEquipe) {

    }

    @Override
    public void deleteDetailEquipe(DetailEquipe detailEquipe) {

    }

    @Override
    public void deleteDetailEquipeById(Long detailEquipeId) {

    }

    @Override
    public List<DetailEquipe> getAllDetailEquipes() {
        return null;
    }

    @Override
    public DetailEquipe getDetailEquipeById(Long detailEquipeId) {
        return null;
    }
}
