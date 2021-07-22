package br.com.vinicius.mvc.processoSeletivo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GrafoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void adicionarGrafoRetorno200() throws Exception {
        URI uri = new URI("/graph");
        String json = "[\n" +
                "    { \n" +
                "      \"source\": \"A\", \"target\": \"B\", \"distance\":6\n" +
                "    },\n" +
                "    { \n" +
                "      \"source\": \"A\", \"target\": \"E\", \"distance\":4\n" +
                "    },\n" +
                "    { \n" +
                "      \"source\": \"B\", \"target\": \"A\", \"distance\":6\n" +
                "    },\n" +
                "    { \n" +
                "      \"source\": \"B\", \"target\": \"C\", \"distance\":2\n" +
                "    },\n" +
                "    { \n" +
                "      \"source\": \"B\", \"target\": \"D\", \"distance\":4\n" +
                "    },\n" +
                "    { \n" +
                "      \"source\": \"C\", \"target\": \"B\", \"distance\":3\n" +
                "    },\n" +
                "    { \n" +
                "      \"source\": \"C\", \"target\": \"D\", \"distance\":1\n" +
                "    },\n" +
                "    { \n" +
                "      \"source\": \"C\", \"target\": \"E\", \"distance\":7\n" +
                "    },\n" +
                "    { \n" +
                "      \"source\": \"E\",  \"target\": \"B\", \"distance\":5\n" +
                "    },\n" +
                "    { \n" +
                "      \"source\": \"E\", \"target\": \"D\", \"distance\":7\n" +
                "    }\n" +
                "]";
        mockMvc.perform(MockMvcRequestBuilders
                .post(uri)
                .content(json)
                .contentType(MediaType.APPLICATION_JSON))
        .andExpect((MockMvcResultMatchers.status().is(201)));
    }

    @Test
    public void listarGrafo404() throws Exception {
        URI uri = new URI("/graph/1");
        mockMvc.perform(MockMvcRequestBuilders
                .get(uri)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect((MockMvcResultMatchers.status().is(404)));
    }
}