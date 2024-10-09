package com.example.demo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSoma(){
        Double resultado = Calculadora.realizarCalculo(5.0, 3.0, "+");
        assertEquals(Double.valueOf(8.0), resultado);
    }

    @Test
    public void testSubtração(){
        Double resultado = Calculadora.realizarCalculo(5.0, 3.0, "-");
        assertEquals(Double.valueOf(2.0), resultado);
    }

    @Test
    public void testMultiplicação(){
        Double resultado = Calculadora.realizarCalculo(5.0, 3.0, "x");
        assertEquals(Double.valueOf(15.0), resultado);
    }

    @Test
    public void testDivisao(){
        Double resultado = Calculadora.realizarCalculo(6.0, 3.0, "/");
        assertEquals(Double.valueOf(2.0), resultado);
    }

    @Test
    public void testOperacaoinvalida(){
        Double resultado = Calculadora.realizarCalculo(5.0, 3.0, "Invalida");
        assertEquals(Double.valueOf(0.0), resultado);
    }
}