package com.doWhile.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade, opcao;
        double altura;

        do{
            System.out.println("1- Registrar nova entrada.");
            System.out.println("2- Sair do programa.");
            System.out.println("Informe a opção desejada:");
            opcao = leia.nextInt();

            if(opcao == 1){
                leia.nextLine();

                System.out.println("Informe o seu nome: ");
                nome = leia.nextLine();
                System.out.println("Informe a sua idade: ");
                idade = leia.nextInt();
                System.out.println("Informe a sua altura:");
                altura = leia.nextDouble();

                // verifica a altura e a idade
                if (idade >= 12 && altura >= 1.15) {
                    System.out.println(nome +" está autorizado(a) a entrar no brinquedo");
                }else{
                    System.out.println(nome +" não está autorizado(a) a entrar no brinquedo.");
                }

            }else if(opcao != 2){
                System.out.println("Opção inválida. Por favor, selecione uma opção válida");
            }
        }while (opcao != 2);
        // "!" quando a opção for diferente do 2

        leia.close();
    }
}
