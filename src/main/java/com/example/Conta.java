package com.example;

public class Conta {
    private static int totalContas = 0; // variável de classe (compartilhada)
    private final String titular;
    protected double saldo; // variável de instância

    public Conta(String titular, double saldoInicial) {
        // TODO: validar titular != null/blank e saldoInicial >= 0
        this.titular = titular;
        this.saldo = saldoInicial;
        // TODO: incrementar contador totalContas
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
        // TODO: validar valor > 0
        this.saldo += valor;
    }

    public boolean levantar(double valor) {
        // TODO: validar valor > 0 e saldo suficiente
        // Atualizar saldo e devolver true/false conforme sucesso
        return false;
    }

    public boolean transferir(Conta destino, double valor) {
        // TODO: reusar levantar/depositar; retornar true/false
        return false;
    }

    /** Comportamento mensal a ser especializado nas subclasses. */
    public void atualizarMensal() {
        // por omissão, não faz nada (pode ser override)
    }

    @Override
    public String toString() {
        return "Conta{titular='" + titular + "', saldo=" + saldo + "}";
    }
}