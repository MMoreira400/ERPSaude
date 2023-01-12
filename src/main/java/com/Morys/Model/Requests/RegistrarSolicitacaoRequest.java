package com.Morys.Model.Requests;

import com.Morys.Model.Entities.*;

import java.util.List;

public class RegistrarSolicitacaoRequest {

    private Cliente cliente;
    private Prestador prestador;
    private List<Procedimento> procedimentos;
    private StatusSolicitacao statusSolicitacao = StatusSolicitacao.NOVO;

    public RegistrarSolicitacaoRequest() {
    }

    public Solicitacao converteEmSolicitacao() {
        Solicitacao solicitacao = new Solicitacao();
        solicitacao.setPrestador(this.prestador);
        solicitacao.setCliente(this.cliente);
        solicitacao.setProcedimentos(this.procedimentos);
        solicitacao.setStatusSolicitacao(this.statusSolicitacao);
        return solicitacao;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public List<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    public StatusSolicitacao getStatusSolicitacao() {
        return statusSolicitacao;
    }

}
