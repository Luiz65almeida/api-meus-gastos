package com.example.api_meus_gastos.domain.model;

public class ErrorResposta {

    private String dataHora;

    private Integer Status;

    private String titulo;

    private String mensagem;

    public ErrorResposta(String dataHora, Integer status, String titulo, String mensagem) {
        this.dataHora = dataHora;
        Status = status;
        this.titulo = titulo;
        this.mensagem = mensagem;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
