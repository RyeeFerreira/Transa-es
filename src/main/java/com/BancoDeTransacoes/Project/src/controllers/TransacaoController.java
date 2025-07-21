package com.BancoDeTransacoes.Project.src.controllers;

import com.BancoDeTransacoes.Project.src.dto.TransacaoDTO;
import com.BancoDeTransacoes.Project.src.models.TransacaoModel;
import com.BancoDeTransacoes.Project.src.models.UsuarioModel;
import com.BancoDeTransacoes.Project.src.repository.UsuarioRepository;
import com.BancoDeTransacoes.Project.src.services.TransacaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {
    private TransacaoService service;

    public TransacaoController(TransacaoService service) {
        this.service = service;

    }

    @PostMapping
    public Optional<TransacaoModel> transferencia(@RequestBody TransacaoDTO transacaoDTO){
       return service.transferencia(transacaoDTO);
    }

    @GetMapping
    public List<TransacaoModel> listar(){
        return service.listar();
    }
}
