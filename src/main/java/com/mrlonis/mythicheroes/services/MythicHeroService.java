package com.mrlonis.mythicheroes.services;

import com.mrlonis.mythicheroes.entities.MythicHero;
import com.mrlonis.mythicheroes.repositories.MythicHeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MythicHeroService {
    private final MythicHeroRepository mythicHeroRepository;

    @Autowired
    MythicHeroService(MythicHeroRepository mythicHeroRepository) {
        this.mythicHeroRepository = mythicHeroRepository;
    }

    public Page<MythicHero> get(String name, String factionName, String rarityName, String typeName, Pageable page) {
        if (name == null && factionName == null && rarityName == null && typeName == null) {
            return this.mythicHeroRepository.findAll(page);
        }

        return this.mythicHeroRepository.findByNameIgnoreCaseContainsAndFaction_NameIgnoreCaseContainsAndRarity_NameIgnoreCaseContainsAndType_NameIgnoreCaseContains(
                name != null ? name : "", factionName != null ? factionName : "", rarityName != null ? rarityName : "",
                typeName != null ? typeName : "", page);
    }
}
