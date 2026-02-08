package com.example;


public class ContaCorrente extends Conta {
    private final double taxaFixa;
    private final double taxaPercentual;

    public ContaCorrente(String titular, double saldoInicial, double taxaFixa, double taxaPercentual) {
        super(titular, saldoInicial);
        if (taxaFixa < 0 || taxaPercentual < 0) {
            throw new IllegalArgumentException("Taxas não podem ser negativas");
        }
        this.taxaFixa = taxaFixa;
        this.taxaPercentual = taxaPercentual;
    }

    @Override
    public void atualizarMensal() {
        double desconto = taxaFixa + (saldo * taxaPercentual);
        // Não permite saldo negativo apenas por causa da taxa
        saldo = Math.max(0, saldo - desconto);
    }
}
