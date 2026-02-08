package com.example;

public class ContaPoupanca extends Conta {
    private final double taxaJuroMensal; // ex: 0.005 => 0.5%

    public ContaPoupanca(String titular, double saldoInicial, double taxaJuroMensal) {
        super(titular, saldoInicial);
        this.taxaJuroMensal = taxaJuroMensal;
    }

    @Override
    public void atualizarMensal() {
        // TODO: saldo += saldo * taxaJuroMensal
    }
}