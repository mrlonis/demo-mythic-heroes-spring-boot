package com.mrlonis.mythicheroes.repositories;

import com.mrlonis.mythicheroes.entities.Faction;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "data", itemResourceRel = "item", path = "faction")
@CrossOrigin(origins = "http://localhost:4200")
public interface FactionRepository extends PagingAndSortingRepository<Faction, UUID> {
    List<Faction> findAll();

    @RestResource(path = "findBy", rel = "findBy")
    List<Faction> findByNameIgnoreCaseContains(@Param("name") String name);
}

