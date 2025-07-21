package com.BancoDeTransacoes.Project.src.services;

import com.BancoDeTransacoes.Project.src.dto.TransacaoDTO;
import com.BancoDeTransacoes.Project.src.models.TransacaoModel;
import com.BancoDeTransacoes.Project.src.models.UsuarioModel;
import com.BancoDeTransacoes.Project.src.repository.TransacaoRepository;
import com.BancoDeTransacoes.Project.src.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TransacaoService {
    private TransacaoRepository repository;
    private UsuarioRepository usuarioRepository;

    public TransacaoService(TransacaoRepository transacaoRepository, UsuarioRepository usuarioRepository){
        this.repository = transacaoRepository;
        this.usuarioRepository = usuarioRepository;
    }


    public Optional<TransacaoModel> transferencia(TransacaoDTO transacaoDTO){
      Optional<UsuarioModel> remetenteOp = usuarioRepository.findById(transacaoDTO.getRemetente_id());
      Optional<UsuarioModel> destinatarioOp = usuarioRepository.findById(transacaoDTO.getDestinatario_id());
      UsuarioModel remetente = remetenteOp.get();
      UsuarioModel destinatario = destinatarioOp.get();

      TransacaoModel transacao = new TransacaoModel();
      transacao.setRemetente(remetente);
      transacao.setDestinatario(destinatario);
      transacao.setValor(transacaoDTO.getValor());
      transacao.setData(LocalDateTime.now());
      repository.save(transacao);

      return repository.findById(transacao.getId());



    }


    public List<TransacaoModel> listar(){
        return repository.findAll();
    };

}
