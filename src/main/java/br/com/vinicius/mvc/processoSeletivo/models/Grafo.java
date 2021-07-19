package br.com.vinicius.mvc.processoSeletivo.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Grafo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany(mappedBy = "grafo")
    private ArrayList<Vertice> vertices;
    @OneToMany(mappedBy = "grafo")
    private ArrayList<Aresta> arestas;

    public long getId() {
        return id;
    }

    public ArrayList<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Vertice> vertices) {
        this.vertices = vertices;
    }

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(ArrayList<Aresta> arestas) {
        this.arestas = arestas;
    }
}
