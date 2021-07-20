package br.com.vinicius.mvc.processoSeletivo.repository;

import br.com.vinicius.mvc.processoSeletivo.models.Grafo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrafoRepository extends JpaRepository<Grafo,Long> {

}
