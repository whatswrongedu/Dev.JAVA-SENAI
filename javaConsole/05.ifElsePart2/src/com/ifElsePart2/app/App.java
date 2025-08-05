package com.ifElsePart2.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade;
        double altura;

        System.out.println("Infome seu nome: ");
        nome = leia.nextLine();

        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();

        System.out.println("Informe sua altura: ");
        altura = leia.nextDouble();


        if( idade >= 12 && altura >= 1.15){
            System.out.println(nome + " está autorrizado.");
        }else {
            System.out.println(nome + " não está autorizado.");
        }

        // Existe uma exceção no Java, e só no Java, de que PRECISA usar a vírgula para separar unidade de dezena, ao invés de pont.



        leia.close();
    }
}
