package com.mrlonis.mythicheroes.controllers;

import com.mrlonis.mythicheroes.entities.MythicHeroes;
import com.mrlonis.mythicheroes.services.MythicHeroesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RestController
@RequestMapping("/afkarena")
public class MythicHeroesController {
    private final MythicHeroesService mythicHeroesService;

    @Autowired
    public MythicHeroesController(MythicHeroesService mythicHeroesService) {
        this.mythicHeroesService = mythicHeroesService;
    }

    @ResponseBody
    @GetMapping(path = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:4200")
    public List<MythicHeroes> getAll() {
        return this.mythicHeroesService.getAll();
    }
}
