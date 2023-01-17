package com.Morys.Model.Requests;

import com.Morys.Model.Entities.Classes.Classe_Prestador;
import com.Morys.Model.Entities.Prestador;

public class RegistrarPrestadorRequest {
    private int classe;
    private String nome;
    private Integer codigo;
    private String cpf;

    public Integer getCodigo() {
        return codigo;
    }


    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
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

    public final Prestador converterPrestador() {
        return new Prestador(this.classe, this.codigo,  this.nome, this.cpf);
    }

}
