package com.whilee.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.print("Informe um número inteiro: ");
        n = leia.nextInt();

        while (n >= 0) {
            System.out.println(n);
            n--;
        }


        leia.close();
    }
}
