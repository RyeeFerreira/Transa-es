package com.BancoDeTransacoes.Project.src.services;


import com.BancoDeTransacoes.Project.src.models.UsuarioModel;
import com.BancoDeTransacoes.Project.src.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private UsuarioModel model;
    private UsuarioRepository repository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.repository = usuarioRepository;
    }

    public List<UsuarioModel> criar(UsuarioModel model){
        repository.save(model);
        return listarTodos();
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

    public List<UsuarioModel> listarTodos(){
        return repository.findAll();
    }
}
