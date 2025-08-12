package com.heranca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instanciar a classe PessoaFisica
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaFisica2 usuario2 = new PessoaFisica2();
        PessoaJuridica empresa = new PessoaJuridica();

        // definindo
        usuario.email = "olasenhora@gmail.com";
        usuario.telefone = "(ola)senh-ora";
        usuario.cep = "Ola senhora";

        usuario.cumprimentar();

        System.out.println("Nome: " + usuario2.nome);
        System.out.println("CPF: " + usuario2.cpf);
        System.out.println("E-mail: " + usuario.email);
        System.out.println("telefone: " + usuario.telefone);
        System.out.println("CEP: " + usuario.cep);

        


        leia.close();
    }
}
