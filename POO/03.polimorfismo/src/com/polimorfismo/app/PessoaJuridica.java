package com.polimorfismo.app;

final public class PessoaJuridica extends Pessoa{
    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;


    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String email, String telefone, String endereco) {
        super(cnpj, telefone, endereco);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String cumprimentar(){
        return "deu certooooooo";
    }
}
