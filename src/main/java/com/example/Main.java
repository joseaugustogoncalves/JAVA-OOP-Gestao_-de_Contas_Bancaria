package com.example;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente("Ana", 200, 5.0, 0.01);
        Conta c2 = new ContaPoupanca("Bruno", 1000, 0.005);

        c1.depositar(100);
        c1.transferir(c2, 50);

        c1.atualizarMensal();
        c2.atualizarMensal();

        System.out.println("Total de contas: " + Conta.getTotalContas());
        System.out.println(c1);
        System.out.println(c2);
    }
}