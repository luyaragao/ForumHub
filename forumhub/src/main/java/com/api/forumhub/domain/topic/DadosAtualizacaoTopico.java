package com.api.forumhub.domain.topic;

public record DadosAtualizacaoTopico(
        String titulo,
        String mensagem,
        StatusTopico status) {
}