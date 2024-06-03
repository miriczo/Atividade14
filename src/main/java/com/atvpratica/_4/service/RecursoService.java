package com.atvpratica._4.service;

import com.atvpratica._4.entity.Recurso;
import com.atvpratica._4.repository.RecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RecursoService {

    @Autowired
    private RecursoRepository recursoRepository;

    public List<Recurso> findByNome(String nome) {
        return recursoRepository.findByNome(nome);
    }
}