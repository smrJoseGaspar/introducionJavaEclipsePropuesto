package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio31Test {

    @Test
    public void probarArrayNormal() {
        Ejercicio31 ej = new Ejercicio31();
        int[] datos = {1, 2, 3, 4, 5};
        assertEquals(15, ej.calcularSuma(datos));
    }

    @Test
    public void probarConCeros() {
        Ejercicio31 ej = new Ejercicio31();
        int[] datos = {0, 0, 0, 0};
        assertEquals(0, ej.calcularSuma(datos));
    }

    @Test
    public void probarNegativos() {
        Ejercicio31 ej = new Ejercicio31();
        int[] datos = {-2, -3, 5};
        assertEquals(0, ej.calcularSuma(datos));
    }
}