package com.example.springapp1.service;

import com.example.springapp1.entity.DetailEquipe;

import java.util.List;

public interface IDetailEquipeService {
    void addDetailEquipe(DetailEquipe detailEquipe);
    void updateDetailEquipe(Long detailEquipeId,DetailEquipe detailEquipe);
    void deleteDetailEquipe(DetailEquipe detailEquipe);
    void deleteDetailEquipeById(Long detailEquipeId);
    List<DetailEquipe> getAllDetailEquipes();
    DetailEquipe getDetailEquipeById(Long detailEquipeId);
}
