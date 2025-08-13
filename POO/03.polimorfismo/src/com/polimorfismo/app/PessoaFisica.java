package com.polimorfismo.app;

final public class PessoaFisica extends Pessoa{
    public String nome;
    public String cpf;
    public String datNascimento;


    public PessoaFisica(String nome, String cpf, String datNascimento, String email, String telefone, String endereco) {
        super(email, telefone, endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.datNascimento = datNascimento;
    }

    public String cumprimentar(){
        return "funcionou";
    }
}
