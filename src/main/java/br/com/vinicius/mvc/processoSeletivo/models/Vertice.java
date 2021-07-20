package br.com.vinicius.mvc.processoSeletivo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Vertice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private List<Aresta> entrada;
    private List<Aresta> saida;

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
}
