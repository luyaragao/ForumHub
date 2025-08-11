package com.api.forumhub.domain.course;

public record DadosDetalhamentoCurso(Long id, String nome, Categoria categoria) {

    public DadosDetalhamentoCurso(Curso curso) {
        this(curso.getId(), curso.getNome(), curso.getCategoria());
    }
}