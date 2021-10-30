package com.mrlonis.mythicheroes.services;

import com.mrlonis.mythicheroes.entities.MythicHeroes;
import com.mrlonis.mythicheroes.repositories.MythicHeroesRepository;
import com.mrlonis.mythicheroes.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MythicHeroesService {
    private final ProjectRepository projectRepository;
    private final MythicHeroesRepository mythicHeroesRepository;

    @Autowired
    public MythicHeroesService(MythicHeroesRepository mythicHeroesRepository,
                               ProjectRepository projectRepository) {
        this.mythicHeroesRepository = mythicHeroesRepository;
        this.projectRepository = projectRepository;
    }

    public List<MythicHeroes> getAll() {
        return mythicHeroesRepository.findAll();
    }
}
