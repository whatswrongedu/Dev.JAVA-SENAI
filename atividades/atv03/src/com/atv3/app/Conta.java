package com.atv3.app;

public class Conta {

    // atributos não devem fazer em uma linha, sempre separados
    public String titular;
    public String cpf;
    public String agencia;
    public String numConta;
    public double saldo;

    // construtor

    public Conta(String titular, String cpf, String agencia, String numConta, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    // métodos
    public void exibirDados() {
        System.out.println("Nome do titular: " + this.titular);
        System.out.print("CPF: " + this.cpf);
        System.out.print("Agência: " + this.agencia);
        System.out.print("Número da conta: " + this.numConta);
        System.out.print("Saldo: " + this.saldo);
    }

    public double fazerDeposito(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    public double fazerSaque(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }

}
