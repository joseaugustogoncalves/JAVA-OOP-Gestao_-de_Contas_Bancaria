package com.example;

public class ContaPoupanca extends Conta {
    private final double taxaJuroMensal;

    public ContaPoupanca(String titular, double saldoInicial, double taxaJuroMensal) {
        super(titular, saldoInicial);
        if (taxaJuroMensal < 0) {
            throw new IllegalArgumentException("Taxa de juro não pode ser negativa");
        }
        this.taxaJuroMensal = taxaJuroMensal;
    }

    @Override
    public void atualizarMensal() {
        saldo += saldo * taxaJuroMensal;
    }
}