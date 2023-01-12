package com.Morys.Model.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Solicitacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne(targetEntity = Cliente.class)
    private Cliente cliente;
    @ManyToOne(targetEntity = Prestador.class)
    private Prestador prestador;
    @OneToMany(targetEntity = Procedimento.class)
    private List<Procedimento> procedimentos;
    @Enumerated(EnumType.STRING)
    private StatusSolicitacao statusSolicitacao = StatusSolicitacao.NOVO;

    public Long getId() {
        return Id;
    }


    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public List<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(List<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
    }

    public StatusSolicitacao getStatusSolicitacao() {
        return statusSolicitacao;
    }

    public void setStatusSolicitacao(StatusSolicitacao statusSolicitacao) {
        this.statusSolicitacao = statusSolicitacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
