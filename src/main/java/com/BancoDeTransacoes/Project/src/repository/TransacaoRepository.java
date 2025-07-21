package com.BancoDeTransacoes.Project.src.repository;

import com.BancoDeTransacoes.Project.src.models.TransacaoModel;
import com.BancoDeTransacoes.Project.src.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface TransacaoRepository extends JpaRepository<TransacaoModel, Long>{
}
