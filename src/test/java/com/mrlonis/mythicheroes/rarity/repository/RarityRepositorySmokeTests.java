package com.mrlonis.mythicheroes.rarity.repository;

import com.mrlonis.mythicheroes.rarity.Rarity;
import com.mrlonis.mythicheroes.rarity.RarityRepository;
import com.mrlonis.mythicheroes.templates.repsoitory.RepositorySmokeTests;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class RarityRepositorySmokeTests extends RepositorySmokeTests<Rarity, RarityRepository> {
}
