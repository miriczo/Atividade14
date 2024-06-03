package com.atvpratica._4.controller;

import com.atvpratica._4.entity.Projeto;
import com.atvpratica._4.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping("/projetos")
    public List<Projeto> findByDescricao(@RequestParam String descricao) {
        return projetoService.findByDescricao(descricao);
    }
}