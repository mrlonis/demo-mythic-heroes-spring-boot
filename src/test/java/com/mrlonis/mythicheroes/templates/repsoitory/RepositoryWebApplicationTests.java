package com.mrlonis.mythicheroes.templates.repsoitory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
abstract public class RepositoryWebApplicationTests {
    private final String route;

    protected RepositoryWebApplicationTests(String route) {
        this.route = route;
    }

    @Test
    public void shouldReturnAll(@Autowired MockMvc mockMvc) throws Exception {
        String url = "/api/" + route;
        mockMvc.perform(get(url)).andDo(print()).andExpect(status().isOk())
               .andExpect(content().string(containsString("_embedded")));
    }

    @Test
    public void shouldReturnAll_v2(@Autowired MockMvc mockMvc) throws Exception {
        String url = "/api/" + route;
        MvcResult result = mockMvc.perform(get(url)).andReturn();

        MockHttpServletResponse response = result.getResponse();
        assertEquals(200, response.getStatus());

        String json = response.getContentAsString();
        assertTrue(json.contains("_embedded"));
    }
}
