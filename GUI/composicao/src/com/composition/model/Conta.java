package com.composition.model;

import com.composition.interfaces.IConta;

public class Conta implements IConta {
    private String agencia;
    private String numConta;
    private double saldo;
    private Pessoa titular;


    public Conta(String agencia, String numConta, double saldo, Pessoa titular) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
    }


    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return this.numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return this.titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    @Override
    public String exibirDados() {
        return "Agência: "+this.agencia+
        "\nNúmero da conta: "+this.numConta+
        "\nSaldo da conta: R$"+String.format(":.2f",this.saldo)+
        "\nNome do titular da conta: "+this.titular.getNome()+
        "\nCPF do titular da conta: "+this.titular.getCpf()+
        "\nE-mail do titular da conta: "+this.titular.getEmail()+
        "\nTelefone do titular da conta: "+this.titular.getTelefone()+
        "\nEndereço do titular da conta: "+this.titular.getEndereco();
    }

    @Override
    public double fazerDeposito(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fazerDeposito'");
    }

    @Override
    public double fazerSaque(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fazerSaque'");
    }

}
