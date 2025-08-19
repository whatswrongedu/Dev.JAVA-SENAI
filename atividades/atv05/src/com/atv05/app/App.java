package com.atv05.app;

import javax.swing.JOptionPane;

import com.atv05.model.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
        Combustivel combustivel = new Combustivel(0, 0);

        String[]opcoes={"Calcular melhor combustível", "Sair"};
        Object opcao;

        do{
            opcao  =JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:",
                null,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );

            
        }while(opcao != "Sair");
    }
}
