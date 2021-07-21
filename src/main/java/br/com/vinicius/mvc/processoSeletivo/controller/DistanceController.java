package br.com.vinicius.mvc.processoSeletivo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/distance")
public class DistanceController {

    @PostMapping("/")
    public void distanciaTotal() {

    }

    @PostMapping("/{id}")
    public void distancia(@PathVariable long id) {

    }

    @PostMapping("/from/{town1}/to/{town2}")
    public void distanciaMinima(@PathVariable long id) {

    }




}
