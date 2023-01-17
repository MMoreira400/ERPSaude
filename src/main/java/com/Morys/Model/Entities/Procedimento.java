package com.Morys.Model.Entities;

import jakarta.persistence.*;

@Entity
public class Procedimento {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private Integer Classe;
    private Integer codigo;
    private String nome;


    public Procedimento() {
    }

    public Procedimento(Integer classe, Integer codigo, String nome) {
        this.Classe = classe;
        this.codigo = codigo;
        this.nome = nome;
    }

    public Long getID() {
        return ID;
    }


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
        nome = nome;
    }
}
