package upe.br.sobreGitTestes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MatematicaBasicaTest {
    @Test
    public void testAdd()
    {
        int num1 = 13;
        int num2 = 12;
        int esperado = 25;
        assertEquals(esperado, MatematicaBasica.add(num1,num2));
    }

    @Test
    public void testSubtract()
    {
        int num1 = 13;
        int num2 = 12;
        int esperado = 1;
        assertEquals(esperado, MatematicaBasica.subtract(num1,num2));
    }

    @Test
    public void testMultiplicate()
    {
        int num1 = 2;
        int num2 = 3;
        int esperado = 6;
        assertEquals(esperado, MatematicaBasica.multiplicate(num1,num2));
    }

    @Test
    public void testDivide()
    {
        int num1 = 8;
        int num2 = 4;
        int esperado = 2;
        assertEquals(esperado, MatematicaBasica.divide(num1,num2));
    }

    @Test
    public void testMod()
    {
        int num1 = 5;
        int num2 = 3;
        int esperado = 2;
        assertEquals(esperado, MatematicaBasica.mod(num1,num2));
    }

    @Test
    public void testExponent() {
        int num1 = 2;
        int num2 = 2;
        int esperado = 4;
        assertEquals(esperado, MatematicaBasica.exponent(num1, num2));
    }
}
