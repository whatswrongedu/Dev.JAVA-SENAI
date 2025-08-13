package com.polimorfismo.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica emresa = new PessoaJuridica(null, null, null, null, null, null);

        System.out.println("Informe o nome do usuário: ");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o cpf do usuário: ");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe a data de nascimento do usuário: ");
        usuario.datNascimento = leia.nextLine();
        System.out.println("Informe o email do usuário: ");
        usuario.email = leia.nextLine();
        System.out.println("Informe o telefone do usuário: ");
        usuario.telefone = leia.nextLine();
        System.out.println("Informe o endereco do usuário: ");
        usuario.endereco = leia.nextLine();



        System.out.println("Informe a razão social da empresa: ");
        emresa.razaoSocial = leia.nextLine();
        System.out.println("Informe o nome fantasia da empresa: ");
        emresa.nomeFantasia = leia.nextLine();
        System.out.println("Informe o nome CNPJ da empresa: ");
        emresa.cnpj = leia.nextLine();
        System.out.println("Informe o email da empresa: ");
        emresa.email = leia.nextLine();
        System.out.println("Informe o telefone da empresa: ");
        emresa.telefone = leia.nextLine();
        System.out.println("Informe o endereco da empresa: ");
        emresa.endereco = leia.nextLine();


        leia.close();
    }
}
