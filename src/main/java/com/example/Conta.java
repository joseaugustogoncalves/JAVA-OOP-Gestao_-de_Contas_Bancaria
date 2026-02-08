package com.example;


public class Conta {
    private static int totalContas = 0;
    private final String titular;
    protected double saldo;

    public Conta(String titular, double saldoInicial) {
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("Titular inválido");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
        totalContas++;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor de depósito deve ser > 0");
        this.saldo += valor;
    }

    public boolean levantar(double valor) {
        if (valor <= 0) return false;
        if (valor > saldo) return false;
        saldo -= valor;
        return true;
    }

    public boolean transferir(Conta destino, double valor) {
        if (destino == null) return false;
        if (levantar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public void atualizarMensal() { /* default: nada */ }

    @Override
    public String toString() {
        return "Conta{titular='" + titular + "', saldo=" + saldo + "}";
    }
}
