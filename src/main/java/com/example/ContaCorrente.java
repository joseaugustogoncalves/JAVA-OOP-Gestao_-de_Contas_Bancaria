package com.example;

public class ContaCorrente extends Conta {
    private final double taxaFixa;     // ex: 5.0€
    private final double taxaPercentual; // ex: 1% => 0.01

    public ContaCorrente(String titular, double saldoInicial, double taxaFixa, double taxaPercentual) {
        super(titular, saldoInicial);
        this.taxaFixa = taxaFixa;
        this.taxaPercentual = taxaPercentual;
    }

    @Override
    public void atualizarMensal() {
        // TODO: saldo -= taxaFixa + (saldo * taxaPercentual), sem permitir ficar negativo por causa da taxa
    }
}