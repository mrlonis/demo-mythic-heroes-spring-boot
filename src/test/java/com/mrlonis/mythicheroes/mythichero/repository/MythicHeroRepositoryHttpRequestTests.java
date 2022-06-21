package com.mrlonis.mythicheroes.mythichero.repository;

import com.mrlonis.mythicheroes.PaginatedResponse;
import com.mrlonis.mythicheroes.mythichero.MythicHero;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class MythicHeroRepositoryHttpRequestTests {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void charactersShouldReturnAll() {
        ParameterizedTypeReference<PaginatedResponse<MythicHero>> responseType = new ParameterizedTypeReference<>() {
        };

        ResponseEntity<String> result = this.restTemplate.exchange(
                "http://localhost:" + port + "/api/mythicHero", HttpMethod.GET, null, String.class);
        System.out.println(result);
        String body = result.getBody();
        assertNotNull(body);
//        assertEquals(0, body.getPageable().getPageNumber());
    }
}
