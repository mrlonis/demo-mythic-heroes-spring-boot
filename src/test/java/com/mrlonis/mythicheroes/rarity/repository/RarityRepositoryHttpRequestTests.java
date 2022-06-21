package com.mrlonis.mythicheroes.rarity.repository;

import com.mrlonis.mythicheroes.templates.repsoitory.RepositoryHttpRequestTests;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class RarityRepositoryHttpRequestTests extends RepositoryHttpRequestTests {
    RarityRepositoryHttpRequestTests() {
        super("rarity");
    }
}
