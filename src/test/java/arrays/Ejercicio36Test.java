package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio36Test {

    @Test
    public void probarPalindromo() {
        Ejercicio36 ej = new Ejercicio36();
        int[] datos = {1, 2, 3, 2, 1};

        assertTrue(ej.esPalindromo(datos));
    }

    @Test
    public void probarNoPalindromo() {
        Ejercicio36 ej = new Ejercicio36();
        int[] datos = {1, 2, 3, 4};

        assertFalse(ej.esPalindromo(datos));
    }

    @Test
    public void probarUnElemento() {
        Ejercicio36 ej = new Ejercicio36();
        int[] datos = {7};

        assertTrue(ej.esPalindromo(datos));
    }

    @Test
    public void probarDosIguales() {
        Ejercicio36 ej = new Ejercicio36();
        int[] datos = {5, 5};

        assertTrue(ej.esPalindromo(datos));
    }
}