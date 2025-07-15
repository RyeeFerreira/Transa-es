package com.BancoDeTransacoes.Project.src.repository;

import com.BancoDeTransacoes.Project.src.models.TransacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TransacaoRepository extends JpaRepository<TransacaoModel, Long>{



}
