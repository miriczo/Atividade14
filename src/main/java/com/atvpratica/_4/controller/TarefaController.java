package com.atvpratica._4.controller;

import com.atvpratica._4.entity.Tarefa;
import com.atvpratica._4.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping("/tarefas")
    public List<Tarefa> findByStatus(@RequestParam String status) {
        return tarefaService.findByStatus(status);
    }
}