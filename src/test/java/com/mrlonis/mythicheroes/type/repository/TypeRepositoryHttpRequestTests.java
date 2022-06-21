package com.mrlonis.mythicheroes.type.repository;

import com.mrlonis.mythicheroes.templates.repsoitory.RepositoryHttpRequestTests;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class TypeRepositoryHttpRequestTests extends RepositoryHttpRequestTests {
    TypeRepositoryHttpRequestTests() {
        super("type");
    }
}
