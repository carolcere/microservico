package br.com.tech4me.microservico.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.microservico.Shared.JogosDto;

public interface JogosService {

    List<JogosDto> obterTodosJogos();
    JogosDto criarJogo(JogosDto jogo);
    JogosDto salvarJogo(JogosDto jogo);
    void excluirJogo(String id);
    Optional<JogosDto> obterJogoPorId(String id);
    JogosDto atualizarJogo(String id, JogosDto novoJogo);
    
    
    
}
