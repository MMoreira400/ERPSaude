package com.Morys.Model.Responses;

import com.Morys.Model.Entities.Cliente;
import com.Morys.Model.Entities.Solicitacao;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.util.List;

public class ClienteDTO {
    private Integer codigo;
    private String nome;

    public ClienteDTO() {
    }

    public Integer getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }



    public ClienteDTO(Cliente cliente) {
        this.codigo = cliente.getCodigo();
        this.nome = cliente.getNome();
    }

}
