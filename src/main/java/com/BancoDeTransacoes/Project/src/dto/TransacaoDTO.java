package com.BancoDeTransacoes.Project.src.dto;

public class TransacaoDTO {
    private Long remetente_id;
    private Long destinatario_id;
    private double valor;

    // Getters e Setters
    public Long getRemetente_id() {
        return remetente_id;
    }

    public void setRemetente_id(Long remetente_id) {
        this.remetente_id = remetente_id;
    }

    public Long getDestinatario_id() {
        return destinatario_id;
    }

    public void setDestinatario_id(Long destinatario_id) {
        this.destinatario_id = destinatario_id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
