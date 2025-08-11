package com.objeto.app;

public class Pessoa {

    public String nome;
    public int idade;
    public double altura;

    // método cumprimentar
    public void exibirDados(){
        System.out.println("Nome:"+this.nome);
        System.out.println("Idade:"+this.idade);
        System.out.println("Altura:"+this.altura+" metros");

    };

}
