package br.com.vinicius.mvc.processoSeletivo.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Vertice {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @OneToMany
    @Nullable
    private List<Aresta> entrada = new ArrayList<>();;
    @OneToMany
    @Nullable
    private List<Aresta> saida =  new ArrayList<>();;

    public Vertice() {}

    public Vertice(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aresta> getEntrada() {
        return entrada;
    }

    public void setEntrada(List<Aresta> entrada) {
        this.entrada = entrada;
    }

    public List<Aresta> getSaida() {
        return saida;
    }

    public void setSaida(List<Aresta> saida) {
        this.saida = saida;
    }

    public void adicionarArestaEntrada(Aresta aresta) {
        this.entrada.add(aresta);
    }

    public void adicionarArestaSaida(Aresta aresta) {
        this.entrada.add(aresta);
    }
}
