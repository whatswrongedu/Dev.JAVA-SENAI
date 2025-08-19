package com.composition.interfaces;

// interface é um "contrato" que as classes assinam pra funcionar
public interface IConta {
    public String exibirDados();
    public double fazerDeposito(double valor);
    public double fazerSaque(double valor);
}
