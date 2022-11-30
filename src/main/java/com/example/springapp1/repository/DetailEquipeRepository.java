package com.example.springapp1.repository;

import com.example.springapp1.entity.DetailEquipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DetailEquipeRepository extends JpaRepository<DetailEquipe, Long> {

    @Query("select de from DetailEquipe de where de.salle = ?1 and de.thematique = ?2")
    Optional<DetailEquipe> findDetailEquipeBySalleAndThematique(Long salle, String thematique);
}
