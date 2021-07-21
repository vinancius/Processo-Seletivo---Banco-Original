package br.com.vinicius.mvc.processoSeletivo.controller.dto;

import br.com.vinicius.mvc.processoSeletivo.models.Aresta;
import br.com.vinicius.mvc.processoSeletivo.models.Grafo;
import br.com.vinicius.mvc.processoSeletivo.models.Vertice;

import java.util.ArrayList;
import java.util.List;

public class ArestaDTO {
    private String source;
    private String target;
    private int distance;
    public ArestaDTO() {
    }
    public ArestaDTO(int distance, String source, String target) {
        this.distance = distance;
        this.source = source;
        this.target = target;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Grafo converterArestasEmGrafo(ArrayList<ArestaDTO> arestasDTO) {
        List<Vertice> vertices = new ArrayList<Vertice>();
        List<Aresta> arestas = new ArrayList<Aresta>();
        List<String> nomeVertices = new ArrayList<String>();
        String inicio;
        String fim;
        for(int i = 0 ; i < arestasDTO.size();i++) {
            fim = arestasDTO.get(i).getTarget();
            inicio = arestasDTO.get(i).getSource();
            if(!nomeVertices.contains(inicio)) {
                nomeVertices.add(inicio);
                vertices.add(new Vertice(inicio));
            }
            if(!nomeVertices.contains(fim)) {
                nomeVertices.add(fim);
                vertices.add(new Vertice(fim));
            }
        }

        for (ArestaDTO aresta:
                arestasDTO) {
            Aresta novaAresta = new Aresta();
            novaAresta.setValor(aresta.getDistance());
            for (Vertice v:
                vertices) {
                if(v.getNome().equals(aresta.getSource())) {
                    novaAresta.setInicio(v);
                    v.adicionarArestaSaida(novaAresta);
                }
                if(v.getNome().equals(aresta.getTarget())) {
                    novaAresta.setFim(v);
                    v.adicionarArestaEntrada(novaAresta);
                }
            }
            arestas.add(novaAresta);
        }
        return new Grafo(vertices,arestas);
    }


}
