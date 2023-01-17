package com.Morys.Model.Entities.Responses;


import com.Morys.Model.Entities.Prestador;

public class PrestadorDTO {

    private Integer codigo;
    private String nome;

    public PrestadorDTO() {
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public PrestadorDTO(Prestador prestador) {
        this.codigo = prestador.getCodigo();
        this.nome = prestador.getNome();
    }

}
