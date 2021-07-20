package br.com.vinicius.mvc.processoSeletivo.controller;

import br.com.vinicius.mvc.processoSeletivo.controller.dto.GrafoDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/graph")
public class GrafoController {

    @PostMapping
    @ResponseBody
    public void adicionar(GrafoDTO grafo) {

    }
}
