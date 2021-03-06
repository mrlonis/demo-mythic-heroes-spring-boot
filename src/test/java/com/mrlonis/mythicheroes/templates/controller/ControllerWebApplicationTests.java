package com.mrlonis.mythicheroes.templates.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

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
public class ControllerWebApplicationTests {
    @Test
    public void shouldReturnAllCharacters(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(get("/api/v2/mythicHero")).andDo(print()).andExpect(status().isOk())
               .andExpect(content().string(containsString("content")));
    }

    @Test
    public void shouldReturnAllCharacters_v2(@Autowired MockMvc mockMvc) throws Exception {
        ResultActions result = mockMvc.perform(get("/api/v2/mythicHero"));
        MvcResult result_v2 = result.andReturn();
        assertEquals(200, result_v2.getResponse().getStatus());
        String json = result_v2.getResponse().getContentAsString();
        assertTrue(json.contains("content"));
    }
}
