package com.Morys.Controllers;

import com.Morys.Model.Entities.Cliente;
import com.Morys.Model.Entities.Solicitacao;
import com.Morys.Model.Repositories.ClienteRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriBuilderFactory;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/apiCliente")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @PostMapping("/registrar")
    public ResponseEntity<Cliente> registrarCliente(@RequestBody Cliente cliente, UriComponentsBuilder uriBuilder){
        Cliente cliente1 = clienteRepository.saveAndFlush(cliente);

        URI uri = uriBuilder.path("/apiCliente/{id}").buildAndExpand(cliente1.getId()).toUri();

        return ResponseEntity.created(uri).body(cliente1);
    }

    @GetMapping("/{id}")
    public ResponseEntity retornaRegistroCliente(@PathVariable Long id){

        Optional<Cliente> cliente = clienteRepository.findById(id);

        if(cliente.isPresent()){
            return ResponseEntity.ok().body(cliente);
        }

        return ResponseEntity.notFound().build();
    }


}
