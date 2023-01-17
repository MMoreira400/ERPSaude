package com.Morys.Model.Entities;

import com.Morys.Model.Entities.Classes.Classe_Prestador;
import jakarta.persistence.*;
@Entity
public class Prestador {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private int classe;
    private Integer codigo;
    private String nome;

    private String cpf;

    public Prestador(int classe, Integer codigo, String nome, String cpf) {
        this.classe = classe;
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Prestador() {
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getId() {
        return Id;
    }

    public Integer getClasse() {
        return classe;
    }

    public void setClasse(Integer classe) {
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
