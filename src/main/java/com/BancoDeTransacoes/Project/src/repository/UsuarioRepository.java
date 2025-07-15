package com.BancoDeTransacoes.Project.src.repository;

import com.BancoDeTransacoes.Project.src.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
}
