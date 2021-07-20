package br.com.vinicius.mvc.processoSeletivo.repository;

import br.com.vinicius.mvc.processoSeletivo.models.Vertice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerticeRepository extends JpaRepository<Vertice,Long> {
    Vertice findByNome(String nome);
}
