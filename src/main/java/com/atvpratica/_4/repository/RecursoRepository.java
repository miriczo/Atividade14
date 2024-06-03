package com.atvpratica._4.repository;

import com.atvpratica._4.entity.Recurso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecursoRepository extends JpaRepository<Recurso, Long> {
    List<Recurso> findByNome(String nome);
}