package com.switchh.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        int x, y;
        double result;
        String operacao;

        System.out.println("Informe o valor de X: ");
        x = leia.nextInt();
        System.out.println("Informe o valor de y: ");
        y = leia.nextInt();

        //limpeza de buffer, se não ele vai ignorar a leitura da String
        leia.nextLine();

        System.out.println("Veja as opções de operações disponíveis:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair ");
        System.out.println("3 - Multiplicar ");
        System.out.println("4 - Dividir ");
        System.out.println("Escolha a opção desejada:");
        operacao = leia.nextLine();


        switch (operacao) {
            case "1":
                result = x+y;
                System.out.println("O resultado da operação é: "+ result);
                break;
            case "2":
                result = x-y;
                System.out.println("O resultado da operação é: "+ result);
                break;
            case "3":
                result = x*y;
                System.out.println("O resultado da operação é: "+ result);
                break;
            case "4":
                result = x/y;
                System.out.println("O resultado da operação é: "+ result);
                break;
            default:
                System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
        }

        leia.close();
    }
}
