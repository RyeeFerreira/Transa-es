package com.BancoDeTransacoes.Project.src.controllers;

import com.BancoDeTransacoes.Project.src.models.TransacaoModel;
import com.BancoDeTransacoes.Project.src.models.UsuarioModel;
import com.BancoDeTransacoes.Project.src.services.TransacaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {
    private TransacaoService service;

    public TransacaoController(TransacaoService service) {
        this.service = service;

    }

    @PostMapping
    public void create(TransacaoModel model){
        service.create(model);
    }

    @GetMapping
    public void listar(){
        service.listar();
    }
}
