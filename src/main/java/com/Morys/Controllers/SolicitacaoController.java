package com.Morys.Controllers;


import com.Morys.Model.Entities.Cliente;
import com.Morys.Model.Entities.Prestador;
import com.Morys.Model.Entities.Procedimento;
import com.Morys.Model.Entities.Solicitacao;
import com.Morys.Model.Repositories.SolicitacaoRepository;
import com.Morys.Model.Requests.RegistrarSolicitacaoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiSolicitacao")
public class SolicitacaoController {

    @Autowired
    SolicitacaoRepository solicitacaoRepository;

    @PostMapping("/")
    public ResponseEntity<Solicitacao> registraSolicitacao(@RequestBody RegistrarSolicitacaoRequest request, UriComponentsBuilder uriBuilder){

        Solicitacao solicitacao1 = solicitacaoRepository.saveAndFlush(request.converteEmSolicitacao());

        URI uri = uriBuilder.path("/{id}").buildAndExpand(solicitacao1.getId()).toUri();


        return ResponseEntity.created(uri).body(solicitacao1);
    }

    @GetMapping("/{id}")
    public ResponseEntity retornaRegistroSolicitacao(@PathVariable Long id){

         Optional<Solicitacao> solicitacao = solicitacaoRepository.findById(id);

         if(solicitacao.isPresent()){
             return ResponseEntity.ok().body(solicitacao);
         }

         return ResponseEntity.notFound().build();

    }

}
