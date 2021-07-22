package br.com.vinicius.mvc.processoSeletivo.controller;

import br.com.vinicius.mvc.processoSeletivo.controller.dto.ArestaDTO;
import br.com.vinicius.mvc.processoSeletivo.models.Aresta;
import br.com.vinicius.mvc.processoSeletivo.models.Grafo;
import br.com.vinicius.mvc.processoSeletivo.models.Vertice;
import br.com.vinicius.mvc.processoSeletivo.repository.ArestaRepository;
import br.com.vinicius.mvc.processoSeletivo.repository.GrafoRepository;
import br.com.vinicius.mvc.processoSeletivo.repository.VerticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/routes")
public class RoutesController {

    @Autowired
    private GrafoRepository grafoRepository;

    @Autowired
    private VerticeRepository verticeRepository;

    @Autowired
    private ArestaRepository arestaRepository;

    @PostMapping("/from/{town1}/to/{town2}")
    public void listarRotasGrafo(@RequestBody ArrayList<ArestaDTO> arestas,@PathVariable String town1, @PathVariable String town2, String maxStops ) {
        if(maxStops == null) {

        } else {

        }
    }

    @PostMapping("{id}/from/{town1}/to/{town2}")
    public void listarRotasGrafo(@RequestBody long id,@RequestBody ArrayList<ArestaDTO> arestas,@PathVariable String town1, @PathVariable String town2, String maxStops ) {
        if(maxStops == null) {

        } else {

        }
    }
}
