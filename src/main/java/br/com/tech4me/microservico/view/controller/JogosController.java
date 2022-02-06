package br.com.tech4me.microservico.view.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.microservico.Shared.JogosDto;
import br.com.tech4me.microservico.model.Jogos;
import br.com.tech4me.microservico.service.JogosService;
import br.com.tech4me.microservico.view.model.JogosModeloRequest;
import br.com.tech4me.microservico.view.model.JogosModeloResponse;
import br.com.tech4me.microservico.view.model.JogosModeloResponseDetalhes;

@RestController
@RequestMapping("/api/jogos")
public class JogosController {

    @Autowired
    private JogosService service;

    @GetMapping(value="/status")
    public String statusServico(@Value("${local.server.port}") String porta) {
        return String.format("Serviço ativo e executando na porta %s", porta);
    }
    

    @PostMapping
    public ResponseEntity<JogosModeloResponse> criarJogo(@RequestBody @Valid JogosModeloRequest jogo) {
        ModelMapper mapper = new ModelMapper();
        JogosDto dto = mapper.map(jogo, JogosDto.class);
        dto = service.criarJogo(dto);
        return new ResponseEntity<>(mapper.map(dto, JogosModeloResponse.class), HttpStatus.CREATED);
    }
    
    @GetMapping
    public ResponseEntity<List<JogosModeloResponse>> obterTodosJogos() {
        List<JogosDto> dtos = service.obterTodosJogos();

        if(dtos.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        ModelMapper mapper = new ModelMapper();
        List<JogosModeloResponse> resp = dtos.stream()
                    .map(dto -> mapper.map(dto, JogosModeloResponse.class))
                    .collect(Collectors.toList());

        return new ResponseEntity<>(resp, HttpStatus.OK);
    }
    
    @GetMapping(value="/{id}")
    public ResponseEntity<JogosModeloResponseDetalhes> obterJogoPorId(@PathVariable String id) {
        Optional<JogosDto> jogo = service.obterJogoPorId(id);

        if(jogo.isPresent()) {
            return new ResponseEntity<>(
                new ModelMapper().map(jogo.get(), JogosModeloResponseDetalhes.class), 
                HttpStatus.OK
            );
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<JogosModeloResponse> atualizarJogo(@PathVariable String id,
        @Valid @RequestBody Jogos jogo) {
        ModelMapper mapper = new ModelMapper();
        JogosDto dto = mapper.map(jogo, JogosDto.class);
        dto = service.atualizarJogo(id, dto);

        return new ResponseEntity<>(mapper.map(dto, JogosModeloResponse.class), HttpStatus.OK);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Void> excluirJogo(@PathVariable String id) {
        service.excluirJogo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } 
}
 
    

