package com.regras.model;

import com.regras.interfaces.Iconta;

public class Conta implements Iconta {
    private String titular;
    private String cpf;
    private String agencia;
    private String numConta;
    private double saldo;
    

    public Conta(String titular, String cpf, String agencia, String numConta, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }


    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    @Override
    public void exibirDados(){
        System.out.println("Nome do titular: "+this.titular);
        System.out.println("CPF do titular: "+this.cpf);
        System.out.println("Agência: "+this.agencia);
        System.out.println("Nome do titular: "+this.numConta);
        System.out.println("Nome do titular: "+String.format("%2f",this.saldo));
    }

    @Override
    public double fazerDeposito(double valor){
        this.saldo+=valor;
        return this.saldo;
    }

    @Override
    public double fazerSaque(double valor){
        this.saldo-=valor;
        return this.saldo;
    }

}