package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio33Test {

    @Test
    public void probarArrayNormal() {
        Ejercicio33 ej = new Ejercicio33();
        int[] datos = {1, 2, 3, 4};

        ej.invertirArray(datos);

        assertArrayEquals(new int[]{4, 3, 2, 1}, datos);
    }

    @Test
    public void probarArrayImpar() {
        Ejercicio33 ej = new Ejercicio33();
        int[] datos = {1, 2, 3};

        ej.invertirArray(datos);

        assertArrayEquals(new int[]{3, 2, 1}, datos);
    }

    @Test
    public void probarArrayUnElemento() {
        Ejercicio33 ej = new Ejercicio33();
        int[] datos = {5};

        ej.invertirArray(datos);

        assertArrayEquals(new int[]{5}, datos);
    }
}