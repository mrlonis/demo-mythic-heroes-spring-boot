package com.mrlonis.mythicheroes.controllers;

import com.mrlonis.mythicheroes.entities.MythicHero;
import com.mrlonis.mythicheroes.repositories.MythicHeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class MythicHeroController {
    private final MythicHeroRepository mythicHeroRepository;

    @Autowired
    MythicHeroController(MythicHeroRepository mythicHeroRepository) {
        this.mythicHeroRepository = mythicHeroRepository;
    }

    @GetMapping("/mythicHero")
    Page<MythicHero> get(@RequestParam(required = false, name = "name") String name,
                         @RequestParam(required = false, name = "faction.name") String factionName,
                         @RequestParam(required = false, name = "rarity.name") String rarityName,
                         @RequestParam(required = false, name = "type.name") String typeName,
                         @PageableDefault(page = 0, size = 100) Pageable page) {
        if (name == null && factionName == null && rarityName == null && typeName == null) {
            return this.mythicHeroRepository.findAll(page);
        }

        return this.mythicHeroRepository.findByNameIgnoreCaseContainsAndFaction_NameIgnoreCaseContainsAndRarity_NameIgnoreCaseContainsAndType_NameIgnoreCaseContains(
                name != null ? name : "", factionName != null ? factionName : "", rarityName != null ? rarityName : "",
                typeName != null ? typeName : "", page);
    }
}
