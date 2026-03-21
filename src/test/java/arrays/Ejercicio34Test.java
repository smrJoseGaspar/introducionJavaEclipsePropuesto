package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio34Test {

    @Test
    public void probarExiste() {
        Ejercicio34 ej = new Ejercicio34();
        int[] datos = {1, 2, 3, 4, 5};

        assertTrue(ej.existeNumero(datos, 3));
    }

    @Test
    public void probarNoExiste() {
        Ejercicio34 ej = new Ejercicio34();
        int[] datos = {1, 2, 3, 4, 5};

        assertFalse(ej.existeNumero(datos, 9));
    }

    @Test
    public void probarPrimerElemento() {
        Ejercicio34 ej = new Ejercicio34();
        int[] datos = {7, 2, 3};

        assertTrue(ej.existeNumero(datos, 7));
    }

    @Test
    public void probarUltimoElemento() {
        Ejercicio34 ej = new Ejercicio34();
        int[] datos = {1, 2, 9};

        assertTrue(ej.existeNumero(datos, 9));
    }
}