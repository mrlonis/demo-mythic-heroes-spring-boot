package com.mrlonis.mythicheroes.faction.repository;

import com.mrlonis.mythicheroes.templates.repsoitory.RepositoryWebApplicationTests;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class FactionRepositoryWebApplicationTests extends RepositoryWebApplicationTests {
    FactionRepositoryWebApplicationTests() {
        super("faction");
    }
}
