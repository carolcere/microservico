package br.com.tech4me.microservico.Shared;

import java.time.LocalDate;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class JogosDto {

    @Id
    private String id;
    @NotBlank(message = "O id não pode estar vazio")
    private String nome;
    @NotBlank(message = "O nome não pode estar vazio")
    private String genero;
    @NotBlank(message = "o gênero deve ser informado")
    private String empresaDesenvolvedora;
    @NotBlank(message = "a empresa deve ser informada")
    private LocalDate dataLancamento;
    @NotBlank(message = "Informe a data de lançamento")
    private String criador;
    @Size(message = "Informe o criador do jogo")
    private String plataforma;
    @Positive(message = "Informe a plataforma disponivel")
    private int classificacao;
    @Positive(message = "È informe a classificação")

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getEmpresaDesenvolvedora() {
        return empresaDesenvolvedora;
    }
    public void setEmpresaDesenvolvedora(String empresaDesenvolvedora) {
        this.empresaDesenvolvedora = empresaDesenvolvedora;
    }
    public LocalDate getDataLancamento() {
        return dataLancamento;
    }
    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    public String getCriador() {
        return criador;
    }
    public void setCriador(String criador) {
        this.criador = criador;
    }
    public String getPlataforma() {
        return plataforma;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public int getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    
    
    
}
