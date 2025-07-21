package com.BancoDeTransacoes.Project.src.repository;

import com.BancoDeTransacoes.Project.src.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
    Optional<UsuarioModel> findByCpf(String cpf);
}
