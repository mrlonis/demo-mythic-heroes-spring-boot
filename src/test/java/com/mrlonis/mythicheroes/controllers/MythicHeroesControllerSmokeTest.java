package com.mrlonis.mythicheroes.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ActiveProfiles("test")
public class MythicHeroesControllerSmokeTest {
    @Autowired
    private MythicHeroController mythicHeroController;

    @Test
    public void contextLoads() {
        assertNotNull(mythicHeroController);
    }
}
