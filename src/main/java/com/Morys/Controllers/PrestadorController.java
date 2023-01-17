package com.Morys.Controllers;

import com.Morys.Model.Entities.Prestador;
import com.Morys.Model.Entities.Responses.PrestadorDTO;
import com.Morys.Model.Repositories.PrestadorRepository;
import com.Morys.Model.Requests.RegistrarPrestadorRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/apiPrestador")
public class PrestadorController {


    @Autowired
    PrestadorRepository prestadorRepository;

    /*@PostMapping("/registrar")
    public ResponseEntity<PrestadorDTO> registrarPrestador(@RequestBody RegistrarPrestadorRequest requestPrestador, UriComponentsBuilder uriBuilder){
        Prestador prestador = prestadorRepository.saveAndFlush(requestPrestador.converterPrestador());

        URI uri = uriBuilder.path("/apiPrestador/{id}").buildAndExpand(prestador.getId()).toUri();

        return ResponseEntity.created(uri).body(PrestadorDTO.toPrestadorDTO(prestador));
    */

    @GetMapping("/{id}")
    public ResponseEntity retornaCadastroDoPrestador(@PathVariable Long id){
        Optional<Prestador> prestador =  prestadorRepository.findById(id);

        if(prestador.isPresent()){
            return ResponseEntity.ok(prestador);
        }
        return ResponseEntity.notFound().build();
    }


}
