package com.Morys.Model.Entities.Responses;

import com.Morys.Model.Entities.Procedimento;

public class ProcedimentoDTO {
    private Integer codigo;
    private String nome;

    public ProcedimentoDTO(Procedimento t) {
    }

    public ProcedimentoDTO() {
    }

    @Override
    public String toString() {
        return "ProcedimentoDTO{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }

    public ProcedimentoDTO(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
