package com.atvpratica._4.service;

import com.atvpratica._4.entity.Projeto;
import com.atvpratica._4.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public List<Projeto> findByDescricao(String descricao) {
        return projetoRepository.findByDescricao(descricao);
    }
}