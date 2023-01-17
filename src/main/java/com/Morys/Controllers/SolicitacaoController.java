package com.Morys.Controllers;


import com.Morys.Model.Entities.Cliente;
import com.Morys.Model.Entities.Prestador;
import com.Morys.Model.Entities.Procedimento;
import com.Morys.Model.Entities.Responses.PrestadorDTO;
import com.Morys.Model.Entities.Responses.ProcedimentoDTO;
import com.Morys.Model.Entities.Responses.SolicitacaoDTO;
import com.Morys.Model.Entities.Solicitacao;
import com.Morys.Model.Repositories.ClienteRepository;
import com.Morys.Model.Repositories.PrestadorRepository;
import com.Morys.Model.Repositories.ProcedimentoRepository;
import com.Morys.Model.Repositories.SolicitacaoRepository;
import com.Morys.Model.Requests.RegistrarSolicitacaoRequest;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiSolicitacao")
public class SolicitacaoController {
    @Autowired
    SolicitacaoRepository solicitacaoRepository;
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    PrestadorRepository prestadorRepository;
    @Autowired
    ProcedimentoRepository procedimentoRepository;

    @PostMapping("/registraSolicitacao")
    public ResponseEntity registraSolicitacao(@RequestBody RegistrarSolicitacaoRequest request, UriComponentsBuilder uriBuilder){


            Cliente cliente = clienteRepository.findByCodigo(request.getCliente().getCodigo());
            Prestador prestador = prestadorRepository.findByCodigo(request.getPrestador().getCodigo());
            List<ProcedimentoDTO> procedimentoDTOList = request.getProcedimentos();
            List<Procedimento> procedimentos = new ArrayList<>();
             procedimentoDTOList.forEach(procedimentoDTO -> {
                 procedimentos.add(procedimentoRepository.findByCodigo(procedimentoDTO.getCodigo()));
             });

             if(cliente != null
                && prestador != null){
                 Solicitacao solicitacao = solicitacaoRepository.saveAndFlush(new Solicitacao(cliente, prestador,procedimentos));

                 URI uri = uriBuilder.path("/apiSolicitacao/{id}").buildAndExpand(solicitacao.getId()).toUri();

                 return ResponseEntity.created(uri).body(solicitacao);

             }else{
                 return ResponseEntity.badRequest().build();
             }



    }

    @GetMapping("/{id}")
    public ResponseEntity retornaRegistroSolicitacao(@PathVariable Long id){

         Optional<Solicitacao> solicitacao = solicitacaoRepository.findById(id);

         if(solicitacao.isPresent()){
             return ResponseEntity.ok().body(solicitacao);
         }

         return ResponseEntity.notFound().build();

    }

    @GetMapping("/teste")
    public List<ProcedimentoDTO> procedimentoDTOList(){
        List<ProcedimentoDTO> procedimentoDTOList = new ArrayList<>();
        procedimentoDTOList.add(new ProcedimentoDTO(202030,"Excisão de Granuloma de corpo estranho"));
        procedimentoDTOList.add(new ProcedimentoDTO(101020,"Investigação Diagnóstica"));

        return  procedimentoDTOList;
    }

}
