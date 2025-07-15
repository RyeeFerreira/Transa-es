package com.BancoDeTransacoes.Project.src.controllers;

import com.BancoDeTransacoes.Project.src.models.UsuarioModel;
import com.BancoDeTransacoes.Project.src.services.UsuarioService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public void create(@RequestBody UsuarioModel model){
        service.create(model);
    }

    @PutMapping
    public void editar(@RequestBody UsuarioModel model){
        service.editar(model);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") Long id){
        service.deletar(id);
    }

    @GetMapping
    public void listar(@RequestBody Long id){
        service.listar(id);
    }
}
