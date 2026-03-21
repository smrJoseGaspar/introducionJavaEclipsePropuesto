package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio30Test {

    @Test
    public void probarArrayNormal() {
        Ejercicio30 ej = new Ejercicio30();
        int[] datos = {3, 7, 2, 9, 5};
        assertEquals(9, ej.buscarMayor(datos));
    }

    @Test
    public void probarTodosIguales() {
        Ejercicio30 ej = new Ejercicio30();
        int[] datos = {4, 4, 4, 4, 4};
        assertEquals(4, ej.buscarMayor(datos));
    }

    @Test
    public void probarNegativos() {
        Ejercicio30 ej = new Ejercicio30();
        int[] datos = {-8, -3, -10, -1, -6};
        assertEquals(-1, ej.buscarMayor(datos));
    }
}