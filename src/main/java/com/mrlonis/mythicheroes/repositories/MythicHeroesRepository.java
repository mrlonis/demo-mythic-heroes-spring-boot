package com.mrlonis.mythicheroes.repositories;

import com.mrlonis.mythicheroes.entities.MythicHeroes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "afkArenaHeroes", path = "afkArenaHeroes")
public interface MythicHeroesRepository extends JpaRepository<MythicHeroes, Integer> {
    List<MythicHeroes> findAll();
}
