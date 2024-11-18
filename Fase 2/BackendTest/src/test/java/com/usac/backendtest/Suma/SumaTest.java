package com.usac.backendtest.Suma;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumaTest {

    Suma suma = new Suma(); //Clase a la que se le realizara una prueba unitaria

    @Before // Para ejecutar algo antes de los metodos test de este archivo
    public void before() {
        System.out.println("Antes de la suma");
    }

    @After // Para ejecutar algo despues de los metodos test de este archivo
    public void after() {
        System.out.println("Despues de la suma");
    }

    @Test
    public void testSuma() {
        int sumaTest = suma.Suma(1,2);
        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, sumaTest);
    }
}
