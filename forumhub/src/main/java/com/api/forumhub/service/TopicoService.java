package com.api.forumhub.service;

import com.api.forumhub.domain.course.Curso;
import com.api.forumhub.domain.topic.*;
import com.api.forumhub.domain.user.Usuario;
import com.api.forumhub.infra.exception.ValidacaoException;
import com.api.forumhub.repository.CursoRepository;
import com.api.forumhub.repository.TopicoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TopicoService {

    private final TopicoRepository topicoRepository;

    private final CursoRepository cursoRepository;

    public TopicoService(TopicoRepository topicoRepository, CursoRepository cursoRepository) {
        this.topicoRepository = topicoRepository;
        this.cursoRepository = cursoRepository;
    }

    @Transactional
    public DadosDetalhamentoTopico criarTopico(DadosCadastroTopico dados, Usuario autor) {
        if (topicoRepository.existsByTituloAndMensagem(dados.titulo(), dados.mensagem())) {
            throw new ValidacaoException("Já existe um tópico com o mesmo título e mensagem.");
        }

        Curso curso = cursoRepository.findById(dados.idCurso())
                .orElseThrow(() -> new EntityNotFoundException("Curso não encontrado com o ID: " + dados.idCurso()));

        Topico novoTopico = new Topico(dados.titulo(), dados.mensagem(), autor, curso);
        topicoRepository.save(novoTopico);

        return new DadosDetalhamentoTopico(novoTopico);
    }

    public Page<DadosListagemTopico> listarTopicos(Pageable paginacao) {
        return topicoRepository.findAll(paginacao).map(DadosListagemTopico::new);
    }

    public DadosDetalhamentoTopico detalharTopico(Long id) {
        Topico topico = topicoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tópico não encontrado. ID: " + id));
        return new DadosDetalhamentoTopico(topico);
    }

    @Transactional
    public DadosDetalhamentoTopico atualizarTopico(Long id, DadosAtualizacaoTopico dados) {
        Topico topico = topicoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Tópico não encontrado. ID: " + id));

        topico.atualizarInformacoes(dados);
        return new DadosDetalhamentoTopico(topico);
    }

    @Transactional
    public void excluirTopico(Long id) {
        if (!topicoRepository.existsById(id)) {
            throw new EntityNotFoundException("Tópico não encontrado. ID: " + id);
        }
        topicoRepository.deleteById(id);
    }
}