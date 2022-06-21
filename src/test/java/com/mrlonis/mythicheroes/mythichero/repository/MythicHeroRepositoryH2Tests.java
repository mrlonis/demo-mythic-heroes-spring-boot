package com.mrlonis.mythicheroes.mythichero.repository;

import com.mrlonis.mythicheroes.mythichero.MythicHeroRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@ActiveProfiles("h2")
public class MythicHeroRepositoryH2Tests {
    @Autowired
    MythicHeroRepository mythicHeroRepository;

    @Test
    void contextLoads() {
        assertNotNull(mythicHeroRepository);
    }
}
