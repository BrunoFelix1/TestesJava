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
    public void testAddDouble()
    {   //considerando o ponto flutuante
        double num1 = 2.1;
        double num2 = 2.2;
        double esperado = 4.300000000000001;
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
    public void testSubtractDouble()
    {
        double num1 = 10.5;
        double num2 = 10.5;
        double esperado = 0;
        assertEquals(esperado, MatematicaBasica.subtract(num1,num2));
    }

    @Test
    public void testMultiplicateDouble()
    {
        double num1 = 2.2;
        double num2 = 3.2;
        double esperado = 7.040000000000001;
        assertEquals(esperado, MatematicaBasica.multiplicate(num1,num2));
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
    public void testDivideDouble()
    {
        double num1 = 8.2;
        double num2 = 4;
        double esperado = 2.05;
        assertEquals(esperado, MatematicaBasica.divide(num1,num2));
    }

    @Test
    public void testMod() //Mod é só para inteiros, não precisa de teste double
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
