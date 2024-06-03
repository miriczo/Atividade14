package com.atvpratica._4.controller;

import com.atvpratica._4.entity.Recurso;
import com.atvpratica._4.service.RecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecursoController {

    @Autowired
    private RecursoService recursoService;

    @GetMapping("/recursos")
    public List<Recurso> findByNome(@RequestParam String nome) {
        return recursoService.findByNome(nome);
    }
}