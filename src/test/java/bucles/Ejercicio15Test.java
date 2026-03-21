package bucles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio15Test {

    @Test
    public void probarHasta10() {
        Ejercicio15 ej = new Ejercicio15();
        int[] resultado = ej.obtenerMultiplosDeTres(10);

        assertArrayEquals(new int[]{3, 6, 9}, resultado);
    }

    @Test
    public void probarHasta5() {
        Ejercicio15 ej = new Ejercicio15();
        int[] resultado = ej.obtenerMultiplosDeTres(5);

        assertArrayEquals(new int[]{3}, resultado);
    }

    @Test
    public void probarSinMultiplos() {
        Ejercicio15 ej = new Ejercicio15();
        int[] resultado = ej.obtenerMultiplosDeTres(2);

        assertEquals(0, resultado.length);
    }
}