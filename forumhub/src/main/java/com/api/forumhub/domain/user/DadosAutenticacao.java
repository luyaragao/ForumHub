package com.api.forumhub.domain.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosAutenticacao(
        @NotBlank
        @Email
        String email,

        @NotBlank
        String senha) {
}