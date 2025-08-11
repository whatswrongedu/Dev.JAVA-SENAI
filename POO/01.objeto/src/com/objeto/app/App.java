package com.objeto.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe pessoa
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa("",0,0.0);

        // define os valores dos atributos
        System.out.print("Informe o nome: ");
        usuario.nome = leia.nextLine();
        System.out.print("Informe o nome: ");
        usuario.idade = leia.nextInt();
        System.out.print("Informe o nome: ");
        usuario.altura = leia.nextDouble();


        // output
        System.out.println(usuario.cumprimentar());
        usuario.exibirDados();

        leia.close();
    }
}
