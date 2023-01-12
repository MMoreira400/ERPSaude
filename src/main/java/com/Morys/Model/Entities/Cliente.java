package com.Morys.Model.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "1000")
    private Integer codigo;
    private String nome;
    private String CPF;
    @OneToMany(targetEntity = Solicitacao.class, cascade = CascadeType.ALL)
    private List<Solicitacao> Solicitacoes;

    public Cliente() {
    }

    public Cliente(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public Cliente(Integer codigo, String nome, String CPF) {
        this.codigo = codigo;
        this.nome = nome;
        this.CPF = CPF;
    }

    public Long getId() {
        return id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public List<Solicitacao> getSolicitacoes() {
        return Solicitacoes;
    }

    public void setSolicitacoes(List<Solicitacao> solicitacoes) {
        Solicitacoes = solicitacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
