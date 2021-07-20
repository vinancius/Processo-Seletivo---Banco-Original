package br.com.vinicius.mvc.processoSeletivo.models;

import br.com.vinicius.mvc.processoSeletivo.controller.dto.ArestaDTO;

import javax.persistence.*;

@Entity
public class Aresta {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int valor;
    @OneToOne
    private Vertice inicio;
    @OneToOne
    private Vertice fim;

    public Aresta() {}

    public Aresta(int valor, Vertice inicio, Vertice fim) {
        this.valor = valor;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Aresta(ArestaDTO arestaDTO) {
        this.valor = arestaDTO.getDistance();

    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Vertice getInicio() {
        return inicio;
    }

    public void setInicio(Vertice inicio) {
        this.inicio = inicio;
    }

    public Vertice getFim() {
        return fim;
    }

    public void setFim(Vertice fim) {
        this.fim = fim;
    }
}
