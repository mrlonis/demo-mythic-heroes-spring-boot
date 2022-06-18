package com.mrlonis.mythicheroes.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ActiveProfiles("test")
public class MythicHeroRepositorySmokeTests {
    @Autowired
    private MythicHeroRepository mythicHeroRepository;

    @Test
    public void contextLoads() {
        assertNotNull(mythicHeroRepository);
    }
}
