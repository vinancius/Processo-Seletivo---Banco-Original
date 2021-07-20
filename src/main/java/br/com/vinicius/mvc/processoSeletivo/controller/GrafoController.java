package br.com.vinicius.mvc.processoSeletivo.controller;

import br.com.vinicius.mvc.processoSeletivo.controller.dto.ArestaDTO;
import br.com.vinicius.mvc.processoSeletivo.controller.dto.GrafoDTO;
import br.com.vinicius.mvc.processoSeletivo.models.Grafo;
import br.com.vinicius.mvc.processoSeletivo.repository.GrafoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/graph")
public class GrafoController {

    @Autowired
    private GrafoRepository grafoRepository;

    @PostMapping
    public void adicionar(@RequestBody List<ArestaDTO> arestas, UriComponentsBuilder uriBuilder) {
        Grafo grafo = new Grafo();
        for (ArestaDTO aresta: arestas
             ) {
            grafo.adicionarAresta(aresta.getDistance(),aresta.getSource(),aresta.getTarget());
        }
        grafoRepository.save(grafo);
        //URI uri = uriBuilder.path("/graph/{id}").buildAndExpand(grafo.getId()).toUri();
        //return ResponseEntity.created(uri)
    }

    /**@GetMapping("/{id}")
    public GrafoDTO listarGrafo(@PathVariable long id) {

    } **/

}
