package com.BancoDeTransacoes.Project.src.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


import java.time.LocalDateTime;

@Entity
@Table(name = "transacoes")
@Data
public class TransacaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    // chave estrangeira para o remetente
    @ManyToOne
    @JoinColumn(name = "remetente_id", referencedColumnName = "id", nullable = false)
    private UsuarioModel remetente;

    // chave estrangeira para o destinatário
    @ManyToOne
    @JoinColumn(name = "destinatario_id", referencedColumnName = "id", nullable = false)
    private UsuarioModel destinatario;
    @Column(name = "valor", nullable = false)
    private double valor;
    private LocalDateTime data;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public UsuarioModel getRemetente() {
        return remetente;
    }

    public void setRemetente(UsuarioModel remetente) {
        this.remetente = remetente;
    }

    public UsuarioModel getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(UsuarioModel destinatario) {
        this.destinatario = destinatario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
