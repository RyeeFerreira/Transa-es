package com.BancoDeTransacoes.Project.src.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "Transacoes")
public class TransacaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private float saldo;
    private LocalDateTime data;
    private UsuarioModel remetente;
    private UsuarioModel destinatario;
}
