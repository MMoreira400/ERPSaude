package com.Morys.Model.Entities.Responses;

import com.Morys.Model.Entities.Solicitacao;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.util.List;

public class ClienteDTO {
    private Integer codigo;
    private String nome;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
