package br.com.vinicius.mvc.processoSeletivo.controller;

import br.com.vinicius.mvc.processoSeletivo.controller.dto.ArestaDTO;
import br.com.vinicius.mvc.processoSeletivo.controller.dto.GrafoDTO;
import br.com.vinicius.mvc.processoSeletivo.models.Grafo;
import br.com.vinicius.mvc.processoSeletivo.repository.ArestaRepository;
import br.com.vinicius.mvc.processoSeletivo.repository.GrafoRepository;
import br.com.vinicius.mvc.processoSeletivo.repository.VerticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/graph")
public class GrafoController {

    @Autowired
    private GrafoRepository grafoRepository;

    @Autowired
    private VerticeRepository verticeRepository;

    @Autowired
    private ArestaRepository arestaRepository;
    @PostMapping
    public void adicionar(@RequestBody ArrayList<ArestaDTO> arestas, UriComponentsBuilder uriBuilder) {
        Grafo grafo = new Grafo();
        for (ArestaDTO aresta: arestas
        ) {
            grafo.adicionarAresta(aresta.getDistance(),aresta.getSource(),aresta.getTarget(),verticeRepository, arestaRepository);
        }
        grafoRepository.save(grafo);
        //URI uri = uriBuilder.path("/graph/{id}").buildAndExpand(grafo.getId()).toUri();
        //return ResponseEntity.created(uri)
    }

    /**@GetMapping("/{id}")
    public GrafoDTO listarGrafo(@PathVariable long id) {

    } **/

}
