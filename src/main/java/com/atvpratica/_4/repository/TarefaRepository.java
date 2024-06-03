package com.atvpratica._4.repository;

import com.atvpratica._4.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    List<Tarefa> findByStatus(String status);
}