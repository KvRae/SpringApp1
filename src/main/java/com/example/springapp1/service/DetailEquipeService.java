package com.example.springapp1.service;

import com.example.springapp1.entity.DetailEquipe;
import com.example.springapp1.repository.DetailEquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DetailEquipeService implements IDetailEquipeService{
    private final DetailEquipeRepository detailEquipeRepository;

    @Autowired
    public DetailEquipeService(DetailEquipeRepository detailEquipeRepository) {
        this.detailEquipeRepository = detailEquipeRepository;
    }


    @Override
    public void addDetailEquipe(DetailEquipe detailEquipe) {
        // TODO checking detailEquipe !existence before inserting
        Optional<DetailEquipe> detailEquipeToAdd = detailEquipeRepository.
                findDetailEquipeBySalleAndThematique(detailEquipe.getSalle(), detailEquipe.getThematique());
        if (detailEquipeToAdd.isPresent()) detailEquipeRepository.save(detailEquipe);
        else throw new IllegalStateException("DetailEquipe with salle " + detailEquipe.getSalle() +
                " and thematique " + detailEquipe.getThematique() + " already exist" );
    }

    @Override
    public void updateDetailEquipe(Long detailEquipeId, DetailEquipe detailEquipe) {
        // TODO checking detailEquipe existence before updating
        DetailEquipe detailEquipeTopUpdate = getDetailEquipeById(detailEquipeId);
        if (detailEquipeTopUpdate != null){
            if (detailEquipe != null && !Objects.equals(detailEquipeTopUpdate, detailEquipe)){
                detailEquipeTopUpdate.setSalle(detailEquipe.getSalle());
                detailEquipeTopUpdate.setThematique(detailEquipe.getThematique());
                detailEquipeRepository.save(detailEquipeTopUpdate);
            }
        }
        else throw new IllegalStateException("DetailEquipe with id " + detailEquipeId + " does not exist");
    }

    @Override
    public void deleteDetailEquipe(DetailEquipe detailEquipe) {
        // TODO checking detailEquipe existence before deleting
        Optional<DetailEquipe> detailEquipeToDelete = detailEquipeRepository.
                findDetailEquipeBySalleAndThematique(detailEquipe.getSalle(), detailEquipe.getThematique());
        if (detailEquipeToDelete.isPresent()) detailEquipeRepository.delete(detailEquipe);
        else throw new IllegalStateException("DetailEquipe with salle " + detailEquipe.getSalle() +
                " and thematique " + detailEquipe.getThematique() + " does not exist" );
    }

    @Override
    public void deleteDetailEquipeById(Long detailEquipeId) {
        // TODO checking detailEquipe existence before deleting
        DetailEquipe detailEquipeToDelete = getDetailEquipeById(detailEquipeId);
        if (detailEquipeToDelete != null) detailEquipeRepository.deleteById(detailEquipeId);
        else throw new IllegalStateException("DetailEquipe with id " + detailEquipeId + " does not exist");
    }

    @Override
    public List<DetailEquipe> getAllDetailEquipes() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe getDetailEquipeById(Long detailEquipeId) {
        return detailEquipeRepository.findById(detailEquipeId)
                .orElseThrow(() -> new IllegalStateException("DetailEquipe does not exist"));
    }
}
