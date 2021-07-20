package br.com.vinicius.mvc.processoSeletivo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aresta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
