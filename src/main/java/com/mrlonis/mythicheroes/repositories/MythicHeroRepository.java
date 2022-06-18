package com.mrlonis.mythicheroes.repositories;

import com.mrlonis.mythicheroes.entities.MythicHero;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "data", itemResourceRel = "item", path = "mythicHero")
@CrossOrigin(origins = {"http://localhost:4200"})
public interface MythicHeroRepository extends PagingAndSortingRepository<MythicHero, UUID> {
    Page<MythicHero> findAll(Pageable pageable);

    @RestResource(path = "findByName", rel = "findByName")
    Page<MythicHero> findByNameIgnoreCaseContains(
            @Param("name") String name,
            Pageable pageable);

    @RestResource(path = "findByFactionName", rel = "findByFactionName")
    Page<MythicHero> findByFaction_NameIgnoreCaseContains(
            @Param("faction.name") String factionName,
            Pageable pageable);

    @RestResource(path = "findByRarityName", rel = "findByRarityName")
    Page<MythicHero> findByRarity_NameIgnoreCaseContains(
            @Param("rarity.name") String rarityName,
            Pageable pageable);

    @RestResource(path = "findByTypeName", rel = "findByTypeName")
    Page<MythicHero> findByType_NameIgnoreCaseContains(
            @Param("type.name") String typeName,
            Pageable pageable);

    @RestResource(path = "findByNameFactionRarityAndType", rel = "findByNameFactionRarityAndType")
    Page<MythicHero> findByNameIgnoreCaseContainsAndFaction_NameIgnoreCaseContainsAndRarity_NameIgnoreCaseContainsAndType_NameIgnoreCaseContains(
            @Param("name") String name,
            @Param("faction.name") String factionName,
            @Param("rarity.name") String rarityName,
            @Param("type.name") String typeName,
            Pageable pageable);
}
