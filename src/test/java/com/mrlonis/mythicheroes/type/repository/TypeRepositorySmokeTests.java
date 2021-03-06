package com.mrlonis.mythicheroes.type.repository;

import com.mrlonis.mythicheroes.templates.repsoitory.RepositorySmokeTests;
import com.mrlonis.mythicheroes.type.Type;
import com.mrlonis.mythicheroes.type.TypeRepository;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class TypeRepositorySmokeTests extends RepositorySmokeTests<Type, TypeRepository> {
}
