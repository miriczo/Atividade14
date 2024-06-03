package com.atvpratica._4.service;

import com.atvpratica._4.entity.Tarefa;
import com.atvpratica._4.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> findByStatus(String status) {
        return tarefaRepository.findByStatus(status);
    }
}