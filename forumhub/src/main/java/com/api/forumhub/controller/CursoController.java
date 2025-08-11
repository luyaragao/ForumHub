package com.api.forumhub.controller;

import com.api.forumhub.domain.course.Curso;
import com.api.forumhub.domain.course.DadosDetalhamentoCurso;
import com.api.forumhub.repository.CursoRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoRepository repository;

    public CursoController(CursoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<DadosDetalhamentoCurso>> listarTodos() {
        List<Curso> cursos = repository.findAll();

        List<DadosDetalhamentoCurso> cursosDTO = cursos.stream()
                .map(DadosDetalhamentoCurso::new)
                .toList();

        return ResponseEntity.ok(cursosDTO);
    }

}
