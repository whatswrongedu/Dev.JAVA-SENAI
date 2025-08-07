package com.atv2.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade, escolha;
        boolean ingresso = false;

        System.out.println("Boas Vindas a Cinemark!");
        System.out.print("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.print("Informe a sua idade: ");
        idade = leia.nextInt();

        do {
            // limpeza de buffer, se não ele vai ignorar a leitura da String
            leia.nextLine();

            System.out.println("                     ");
            System.out.println("Veja as opções de filmes em cartaz:");
            System.out.println("1 - Angel Heart (+18)");
            System.out.println("2 - Lord of the Rings (+12)");
            System.out.println("3 - Willd Robot (L)");
            System.out.println("4 - Star Wars (L)");
            System.out.println("5 - Alien: Romulus (+16) ");
            System.out.println("6 - Sair do programa");
            System.out.println("Escolha o filme desejado:");
            escolha = leia.nextInt();
            System.out.println("                     ");

            switch (escolha) {
                case 1:
                    if (idade < 18) {
                        System.out.println(
                                "Você não tem idade suficiente para assistir a este filme :( Por favor, escolha outro");
                        System.out.println("                     ");
                    } else {
                        System.out.println("Ingresso imprimido com sucesso! Boa sessão " + nome + " <3");
                        ingresso = true;
                    }
                    break;

                case 2:
                    if (idade < 12) {
                        System.out.println(
                                "Você não tem idade suficiente para assistir a este filme :( Por favor, escolha outro");
                    } else {
                        System.out.println("Ingresso imprimido com sucesso! Boa sessão " + nome + " <3");
                        ingresso = true;
                    }
                    break;
                case 3:
                    System.out.println("Ingresso imprimido com sucesso! Boa sessão <3");
                    ingresso = true;
                    break;

                case 4:
                    System.out.println("Ingresso imprimido com sucesso! Boa sessão " + nome + " <3");
                    ingresso = true;
                    System.out.println("                     ");
                    break;

                case 5:
                    if (idade < 16) {
                        System.out.println(
                                "Você não tem idade suficiente para assistir a este filme :( Por favor, escolha outro");
                        leia.close();
                    } else {
                        System.out.println("Ingresso imprimido com sucesso! Boa sessão " + nome + " <3");
                        ingresso = true;
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
            }
        } while (escolha != 6 && !ingresso);
        leia.close();
    }
}
