package br.com.vinicius.mvc.processoSeletivo.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vertice {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @OneToMany
    private List<Aresta> entrada;
    @OneToMany
    private List<Aresta> saida;

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
