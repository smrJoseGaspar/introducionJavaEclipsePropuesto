package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio32Test {

    @Test
    public void probarArrayMixto() {
        Ejercicio32 ej = new Ejercicio32();
        int[] datos = {1, 2, 3, 4, 5, 6};
        assertEquals(3, ej.contarPares(datos));
    }

    @Test
    public void probarTodosPares() {
        Ejercicio32 ej = new Ejercicio32();
        int[] datos = {2, 4, 6, 8};
        assertEquals(4, ej.contarPares(datos));
    }

    @Test
    public void probarSinPares() {
        Ejercicio32 ej = new Ejercicio32();
        int[] datos = {1, 3, 5, 7};
        assertEquals(0, ej.contarPares(datos));
    }

    @Test
    public void probarConCero() {
        Ejercicio32 ej = new Ejercicio32();
        int[] datos = {0, 1, 2};
        assertEquals(2, ej.contarPares(datos));
    }
}