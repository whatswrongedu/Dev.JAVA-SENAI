package com.quatroPilares.model;

final public class PessoaFisica extends Pessoa {
    private String nome;
    private String datnascimento;
    private String cpf;


    public PessoaFisica(String nome, String datnascimento, String cpf, String email, String telefone, String endereco) {
        super(email,telefone,endereco);
        this.nome = nome;
        this.datnascimento = datnascimento;
        this.cpf = cpf;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatnascimento() {
        return this.datnascimento;
    }

    public void setDatnascimento(String datnascimento) {
        this.datnascimento = datnascimento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
