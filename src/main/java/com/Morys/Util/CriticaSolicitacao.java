package com.Morys.Util;

import com.Morys.Model.Entities.Prestador;
import com.Morys.Model.Entities.Solicitacao;
import com.Morys.Model.Repositories.PrestadorRepository;

import java.util.Optional;

public class CriticaSolicitacao {

    public CriticaSolicitacao() {
    }

    /* CRÍTICAS */

    public final boolean validaPrestadorSolicitacao(Solicitacao solicitacao, PrestadorRepository prestadorRepository){

        Optional<Prestador> prestador = prestadorRepository.findById(solicitacao.getPrestador().getId());

        if(prestador.isPresent()){
            return true;
        }

        return false;

    }


}
