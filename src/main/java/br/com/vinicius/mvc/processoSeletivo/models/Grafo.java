package br.com.vinicius.mvc.processoSeletivo.models;

import br.com.vinicius.mvc.processoSeletivo.repository.ArestaRepository;
import br.com.vinicius.mvc.processoSeletivo.repository.VerticeRepository;

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

    public Grafo() {
    }

    public Grafo(List<Vertice> vertices, List<Aresta> arestas) {
        this.vertices = vertices;
        this.arestas = arestas;
    }

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

    public void adicionarAresta(int valor, String nomeEntrada, String nomeSaida, VerticeRepository verticeRepository,
                                ArestaRepository arestaRepository) {
        Vertice entrada = verticeRepository.findByNome(nomeEntrada);
        Vertice saida = verticeRepository.findByNome(nomeSaida);
        if(entrada == null) {
            entrada = new Vertice(nomeEntrada);
            verticeRepository.save(entrada);
            this.vertices.add(entrada);
        }
        if(saida == null) {
            saida = new Vertice(nomeSaida);
            verticeRepository.save(saida);
            this.vertices.add(saida);
        }
        Aresta aresta = new Aresta(valor,entrada,saida);

        entrada.adicionarArestaSaida(aresta);
        saida.adicionarArestaEntrada(aresta);

        arestaRepository.save(aresta);

        verticeRepository.save(entrada);
        verticeRepository.save(saida);

        this.arestas.add(aresta);
    }

    public void busca() {

    }

}
