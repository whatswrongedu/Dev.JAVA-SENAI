package com.atv01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // calcular peso/altura*altura

        String nome, calcular;
        int opcao;
        double altura, peso, result;

        do {
            System.out.println("Boas vindas! O que deseja?");
            System.out.println("1- Calcular seu IMC.");
            System.out.println("2- Sair do programa.");
            System.out.println("Informe a opção desejada:");
            opcao = leia.nextInt();

            if (opcao == 1) {
                leia.nextLine();

                System.out.println("Infome seu nome: ");
                nome = leia.nextLine();
                System.out.println("Infome sua altura: ");
                altura = leia.nextDouble();
                System.out.println("Infome seu peso: ");
                peso = leia.nextDouble();

                leia.nextLine();

                System.out.println("Deseja realizar o cálculo?");
                calcular = leia.nextLine();
                

                if(calcular != "s"){
                    result = altura + peso + altura;
                    System.out.println(nome+" o resultado da operação é: " + result);
                }else{
                    System.out.println("Operação cancelada.");
                }
            }
        }while(opcao!=2);

    leia.close();
}}
