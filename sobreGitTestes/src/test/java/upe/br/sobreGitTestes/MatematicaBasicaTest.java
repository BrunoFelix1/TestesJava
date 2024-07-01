package upe.br.sobreGitTestes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MatematicaBasicaTest {
    @Test
    public void shouldAnswerWithTrue()
    {
        int num1 = 13;
        int num2 = 12;
        int esperado = 25;
        assertEquals(esperado, MatematicaBasica.add(num1,num2));
    }
}
