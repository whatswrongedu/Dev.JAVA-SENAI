package com.quatroPilares.app;

import java.util.Scanner;

import com.quatroPilares.model.PessoaFisica;
import com.quatroPilares.model.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);



        //usuário
        System.out.println("Informe o nome do usuário: ");
        usuario.setNome(leia.nextLine());
        System.out.println("Informe a data de nascimento do usuário: ");
        usuario.setDatnascimento(leia.nextLine());
        System.out.println("Informe o cpf do usuário: ");
        usuario.setCpf(leia.nextLine());
        System.out.println("Informe o email do usuário: ");
        usuario.setEmail(leia.nextLine());
        System.out.println("Informe o telefone do usuário: ");
        usuario.setTelefone(leia.nextLine());
        System.out.println("Informe o endereco do usuário: ");
        usuario.setEndereco(leia.nextLine());



        //empresa
        System.out.println("Informe a razão social da empresa: ");
        empresa.setRazaoSocial(leia.nextLine());
        System.out.println("Informe o nome fantasia da empresa: ");
        empresa.setNomeFantasia(leia.nextLine());
        System.out.println("Informe o nome CNPJ da empresa: ");
        empresa.setCnpj(leia.nextLine());
        System.out.println("Informe o email da empresa: ");
        empresa.setEmail(leia.nextLine());
        System.out.println("Informe o telefone da empresa: ");
        empresa.setTelefone(leia.nextLine());
        System.out.println("Informe o endereco da empresa: ");
        empresa.setEndereco(leia.nextLine());



        //usuário
        System.out.println("\nInformações do usuário:\n");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("Data de nascimento: " + usuario.getDatnascimento());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Telefone: " + usuario.getTelefone());
        System.out.println("Endereço: " + usuario.getEndereco());



        //empresa
        System.out.println("\nInformações do usuário:\n");
        System.out.println("Razão social:: " + empresa.getRazaoSocial());
        System.out.println("Nome da empresa: " + empresa.getNomeFantasia());
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("E-mail da empresa: " + empresa.getEmail());
        System.out.println("Telefone da empresa: " + empresa.getTelefone());
        System.out.println("Emdereço da empresa: " + empresa.getEndereco());

        leia.close();
    }
}
