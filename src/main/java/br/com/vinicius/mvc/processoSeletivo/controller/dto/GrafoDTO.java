package br.com.vinicius.mvc.processoSeletivo.controller.dto;
import br.com.vinicius.mvc.processoSeletivo.models.Grafo;

import java.util.List;

public class GrafoDTO {
    private long id;
    private List<VerticeDTO> vertices;
    private List<ArestaDTO> arestas;

}
