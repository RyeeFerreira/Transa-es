package com.BancoDeTransacoes.Project.src.services;

import com.BancoDeTransacoes.Project.src.models.TransacaoModel;
import com.BancoDeTransacoes.Project.src.repository.TransacaoRepository;
import com.BancoDeTransacoes.Project.src.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class TransacaoService {
    private TransacaoRepository repository;

    public TransacaoService(TransacaoRepository transacaoRepository){
        this.repository = transacaoRepository;
    }

    public void create(TransacaoModel model){
        repository.save(model);
    };

    public void listar(){
        repository.findAll();
    };

}
