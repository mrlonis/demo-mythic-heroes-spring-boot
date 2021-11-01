package com.mrlonis.mythicheroes.repositories;

import com.mrlonis.mythicheroes.entities.MythicHeroes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "mythicHeroes", path = "mythicHeroes")
@CrossOrigin(origins = "http://localhost:4200")
public interface MythicHeroesRepository extends PagingAndSortingRepository<MythicHeroes, UUID> {
    List<MythicHeroes> findAll();

    List<MythicHeroes> findByHeroName(@Param("heroName") String heroName);
}
