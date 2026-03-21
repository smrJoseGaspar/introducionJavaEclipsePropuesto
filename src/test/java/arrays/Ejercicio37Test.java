package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio37Test {

    @Test
    public void probarRepeticiones() {
        Ejercicio37 ej = new Ejercicio37();
        int[] datos = {1, 2, 2, 3, 1};

        int[][] resultado = ej.contarRepeticiones(datos);

        // comprobamos algunos valores
        assertEquals(2, resultado[0][1]); // 1 aparece 2 veces
        assertEquals(2, resultado[1][1]); // 2 aparece 2 veces
        assertEquals(1, resultado[2][1]); // 3 aparece 1 vez
    }

    @Test
    public void probarSinRepetidos() {
        Ejercicio37 ej = new Ejercicio37();
        int[] datos = {1, 2, 3};

        int[][] resultado = ej.contarRepeticiones(datos);

        assertEquals(1, resultado[0][1]);
        assertEquals(1, resultado[1][1]);
        assertEquals(1, resultado[2][1]);
    }
}