package com.mrlonis.mythicheroes.rarity.repository;

import com.mrlonis.mythicheroes.templates.repsoitory.RepositoryWebApplicationTests;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class RarityRepositoryWebApplicationTests extends RepositoryWebApplicationTests {
    RarityRepositoryWebApplicationTests() {
        super("rarity");
    }
}
