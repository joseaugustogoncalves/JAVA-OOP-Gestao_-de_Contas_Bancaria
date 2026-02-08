package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ContaTest {

    @Test
    void deveIncrementarTotalDeContas() {
        int antes = Conta.getTotalContas();
        new ContaPoupanca("X", 0, 0.01);
        new ContaCorrente("Y", 0, 1.0, 0.0);
        assertEquals(antes + 2, Conta.getTotalContas());
    }

    @Test
    void depositoLevantamentoTransferenciaFuncionam() {
        Conta a = new ContaPoupanca("A", 100, 0.0);
        Conta b = new ContaCorrente("B", 50, 0, 0);

        a.depositar(50); // 150
        assertTrue(a.levantar(30)); // 120
        assertTrue(a.transferir(b, 20)); // a:100 b:70
        assertEquals(100, a.getSaldo(), 0.0001);
        assertEquals(70, b.getSaldo(), 0.0001);
    }

    @Test
    void atualizarMensalEhPolimorfico() {
        Conta cc = new ContaCorrente("CC", 200, 5, 0.01); // 5 + 2 = 7
        Conta cp = new ContaPoupanca("CP", 1000, 0.005);  // +0.5% => +5
        cc.atualizarMensal();
        cp.atualizarMensal();
        assertEquals(193, cc.getSaldo(), 0.0001);
        assertEquals(1005, cp.getSaldo(), 0.0001);
    }
}
