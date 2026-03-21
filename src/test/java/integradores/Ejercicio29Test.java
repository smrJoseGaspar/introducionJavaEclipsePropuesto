package integradores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio29Test {

    @Test
    public void probar6Terminos() {
        Ejercicio29 ej = new Ejercicio29();
        assertArrayEquals(new int[]{0,1,1,2,3,5}, ej.generarFibonacci(6));
    }

    @Test
    public void probar1Termino() {
        Ejercicio29 ej = new Ejercicio29();
        assertArrayEquals(new int[]{0}, ej.generarFibonacci(1));
    }

    @Test
    public void probar0Terminos() {
        Ejercicio29 ej = new Ejercicio29();
        assertEquals(0, ej.generarFibonacci(0).length);
    }

    @Test
    public void probar3Terminos() {
        Ejercicio29 ej = new Ejercicio29();
        assertArrayEquals(new int[]{0,1,1}, ej.generarFibonacci(3));
    }
}