package com.mrlonis.mythicheroes.repositories;

import com.mrlonis.mythicheroes.entities.MythicHero;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "data", itemResourceRel = "item", path = "mythicHero")
@CrossOrigin(origins = "http://localhost:4200")
public interface MythicHeroRepository extends PagingAndSortingRepository<MythicHero, UUID> {
    List<MythicHero> findAll();

    List<MythicHero> findByName(@Param("name") String name);
}
