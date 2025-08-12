package com.atv3.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Conta cc = new Conta(null, null, null, null, 0);
        int opcao;
        double valor;

        System.out.println("Boas Vindas!!");
        System.out.print("Informe o nome do titular: ");
        cc.titular = leia.nextLine();
        System.out.print("Informe o CPF do titular: ");
        cc.cpf = leia.nextLine();

        do {
            System.out.println("BANCO JAVA");
            System.out.println("1- Exibir dados da conta");
            System.out.println("2- Fazer depósito");
            System.out.println("3- fazer saque");
            System.out.println("4- Sair do programa");
            System.out.println("Qual opção vc deseja?");

            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    cc.exibirDados();
                    break;
                case 2:
                    System.out.print("Informe o valor do depósito em R$: ");
                    valor = leia.nextDouble();
                    System.out.println((valor > 0)?"Depósito efetuado com sucesso. Saldo: R$"+cc.fazerDeposito(valor) : "valor do depósito inválido.");
                    break;
                case 3:
                System.out.print("Informe o valor do saque em R$: ");
                valor = leia.nextDouble();
                System.out.println((valor > 0 && valor <= cc.saldo)? "Saque efetuado com sucesso. Saldo: R$"+cc.fazerSaque(valor):"Valor do saque inválido.");
                break;
                case 4:
                    System.out.println("programa encerrado");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor selecione uma opção válida");

            }

        } while (opcao != 4);

        leia.close();
    }
}
