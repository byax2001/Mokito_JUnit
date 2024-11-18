package com.usac.backendtest.Multiplicador;

import com.usac.backendtest.Multiplicacion.Multiplicador;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultiplicadorTest {
    Multiplicador m = new Multiplicador();
    @Test
    public void testMultiplicador() {
        int mult = m.multiplicar(3);
        int resultadoEsperado = 9;
        assertEquals(resultadoEsperado, mult);
    }
}
