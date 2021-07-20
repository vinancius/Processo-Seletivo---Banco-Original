package br.com.vinicius.mvc.processoSeletivo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Grafo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany
    private List<Vertice> vertices = new ArrayList<>();
    @OneToMany
    private List<Aresta> arestas = new ArrayList<>();

    public long getId() {
        return id;
    }

    public List<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertice> vertices) {
        this.vertices = vertices;
    }

    public List<Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(List<Aresta> arestas) {
        this.arestas = arestas;
    }
}
