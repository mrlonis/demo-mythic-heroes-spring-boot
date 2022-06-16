package com.mrlonis.mythicheroes.controllers;

import com.mrlonis.mythicheroes.entities.MythicHero;
import com.mrlonis.mythicheroes.repositories.MythicHeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiv2")
public class MythicHeroController {
    private final MythicHeroRepository mythicHeroRepository;

    @Autowired
    MythicHeroController(MythicHeroRepository mythicHeroRepository) {
        this.mythicHeroRepository = mythicHeroRepository;
    }

    @GetMapping("/mythicHeroes")
    Page<MythicHero> getAll(Pageable page) {
        return this.mythicHeroRepository.findAll(page);
    }
}
