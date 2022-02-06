package br.com.tech4me.microservico.view.model;

import java.time.LocalDate;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class JogosModeloRequest {
    
    

    @NotBlank(message = "O nome deve possuir caracteres não brancos")
    @NotEmpty(message = "O nome deve ser preenchido")
    @Size(min = 2, message = "O nome deve ter, no mínimo, 2 caracteres")
    private String nome;

    @NotBlank(message = "O gênero deve possuir caracteres não brancos")
    @NotEmpty(message = "O gênero deve ser preenchido")
    private String genero;

    @NotBlank(message = "O Desenvolvedora deve possuir caracteres não brancos")
    @NotEmpty(message = "O Desenvolvedor deve ser preenchido")
    private String empresaDesenvolvedora;

    @NotBlank(message = "A data de lançamento deve possuir caracteres não brancos")
    @NotEmpty(message = " deve ser preenchido")
    private LocalDate dataLancamento;

    @NotBlank(message = "O criador deve possuir caracteres não brancos")
    @NotEmpty(message = " deve ser preenchido")
    private String criador;

    @NotBlank(message = "A plataforma deve possuir caracteres não brancos")
    @NotEmpty(message = "O nome deve ser informada")
    private String plataforma;

    @NotBlank(message = "O classificação deve possuir caracteres não brancos")
    @NotEmpty(message = "O nome deve ser informada")
    private int classificacao;
    
    
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
