package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio35Test {

    @Test
    public void probarMediaNormal() {
        Ejercicio35 ej = new Ejercicio35();
        int[] datos = {2, 4, 6, 8};
        assertEquals(5.0, ej.calcularMedia(datos));
    }

    @Test
    public void probarMediaConImpares() {
        Ejercicio35 ej = new Ejercicio35();
        int[] datos = {1, 2, 3};
        assertEquals(2.0, ej.calcularMedia(datos));
    }

    @Test
    public void probarTodosIguales() {
        Ejercicio35 ej = new Ejercicio35();
        int[] datos = {5, 5, 5};
        assertEquals(5.0, ej.calcularMedia(datos));
    }

    @Test
    public void probarConCero() {
        Ejercicio35 ej = new Ejercicio35();
        int[] datos = {0, 0, 0};
        assertEquals(0.0, ej.calcularMedia(datos));
    }
}