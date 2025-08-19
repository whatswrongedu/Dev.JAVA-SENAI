package com.composition.model;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;


    public Pessoa(String nome, String cpf, String email, String telefone, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

}
