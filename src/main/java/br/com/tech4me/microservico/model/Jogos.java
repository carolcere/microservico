package br.com.tech4me.microservico.model;

import java.time.LocalDate;

public class Jogos {

    private String id;
    private String nome;
    private String genero;
    private String empresaDesenvolvedora;
    private LocalDate dataLancamento;
    private String criador;
    private String plataforma;
    private int classificacao;


    public String getId() {
        return id;
    }
   
    public void setId(String id2) {
        this.id = id2;
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

    @Override
    public String toString() {
        return "Jogos [id=" + id + ", nome=" + nome + ", genero=" + genero + ", classificacao=" + classificacao + "]";
    }

}
