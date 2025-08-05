package com.ifElse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String nome;
        double nota;

        System.out.println("Informe o nome do aluno(a): ");
        nome = leia.nextLine();
        System.out.println("Informe a nota do aluno(a): ");
        nota = leia.nextDouble();

        if(nota >= 7){
            System.out.println(nome + " está aprovado.");
        }else if (nota >= 5){
            System.out.println(nome + " está de recuperação.");
        }else{
            System.out.println(nome + " está reprovado.");
        }

        leia.close();
    }
}
