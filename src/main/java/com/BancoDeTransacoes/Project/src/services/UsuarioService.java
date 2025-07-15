package com.BancoDeTransacoes.Project.src.services;


import com.BancoDeTransacoes.Project.src.models.UsuarioModel;
import com.BancoDeTransacoes.Project.src.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private UsuarioModel model;
    private UsuarioRepository repository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.repository = usuarioRepository;
    }

    public void create(UsuarioModel model){
        repository.save(model);
    };

    public void editar(UsuarioModel model){
        repository.save(model);
    };

    public void deletar(Long id){
        repository.deleteById(id);
    };

    public void listar(Long id){
        repository.findById(id);
    }
}
