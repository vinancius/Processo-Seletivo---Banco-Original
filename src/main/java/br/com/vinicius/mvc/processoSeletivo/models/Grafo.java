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

    public void adicionarVertice(String nome) {
        Vertice vertice = new Vertice(nome);
        this.vertices.add(vertice);
    }

    public void adicionarAresta(int valor, String nomeEntrada, String nomeSaida) {
        Vertice entrada = this.getVertice(nomeEntrada);
        Vertice saida = this.getVertice(nomeSaida);
        Aresta aresta = new Aresta(valor,entrada,saida);
        entrada.adicionarArestaEntrada(aresta);
        entrada.adicionarArestaSaida(aresta);
        this.arestas.add(aresta);
    }

    public Vertice getVertice(String nome) {
        System.out.println("asuihdsiaudhdiasudhadhus");
        Vertice vertice = null;
        System.out.println("asuihdsiaudhdiasudhadhus");
        for(int i = 0; i < this.vertices.size(); i++) {
            if(this.vertices.get(i).getNome().equals(nome)) {
                vertice = this.vertices.get(i);
                break;
            }
        }
        if(vertice == null) {
            vertice = new Vertice(nome);
        }
        return vertice;
    }
}
