package integradores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio25Test {

    @Test
    public void probarHasta10() {
        Ejercicio25 ej = new Ejercicio25();
        assertArrayEquals(new int[]{2,3,5,7}, ej.obtenerPrimosHasta(10));
    }

    @Test
    public void probarHasta2() {
        Ejercicio25 ej = new Ejercicio25();
        assertArrayEquals(new int[]{2}, ej.obtenerPrimosHasta(2));
    }

    @Test
    public void probarSinPrimos() {
        Ejercicio25 ej = new Ejercicio25();
        assertEquals(0, ej.obtenerPrimosHasta(1).length);
    }
}