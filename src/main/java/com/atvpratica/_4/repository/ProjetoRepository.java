package com.atvpratica._4.repository;

import com.atvpratica._4.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
    List<Projeto> findByDescricao(String descricao);
}
