package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    public void testIsMaiorDeIdadeWhenAgeIs18() {
        Pessoa pessoa = new Pessoa("Ana", 18);
        assertTrue(pessoa.isMaiorDeIdade(), "A pessoa deveria ser maior de idade com 18 anos.");
    }

    @Test
    public void testIsMaiorDeIdadeWhenAgeIsBelow18() {
        Pessoa pessoa = new Pessoa("Pedro", 17);
        assertFalse(pessoa.isMaiorDeIdade(), "A pessoa não deveria ser maior de idade com menos de 18 anos.");
    }

    @Test
    public void testSetterAndGetter() {
        Pessoa pessoa = new Pessoa("Carlos", 25);
        pessoa.setNome("Marcos");
        pessoa.setIdade(30);

        assertEquals("Marcos", pessoa.getNome());
        assertEquals(30, pessoa.getIdade());
    }
}