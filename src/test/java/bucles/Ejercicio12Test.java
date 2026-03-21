package bucles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio12Test {

    @Test
    public void probarSumaNormal() {
        Ejercicio12 ej = new Ejercicio12();
        int[] datos = {2, 3, 4, 0, 9, 8};
        assertEquals(9, ej.calcularSumaHastaCero(datos));
    }

    @Test
    public void probarCeroAlPrincipio() {
        Ejercicio12 ej = new Ejercicio12();
        int[] datos = {0, 5, 6};
        assertEquals(0, ej.calcularSumaHastaCero(datos));
    }

    @Test
    public void probarConNegativos() {
        Ejercicio12 ej = new Ejercicio12();
        int[] datos = {5, -2, -1, 0, 7};
        assertEquals(2, ej.calcularSumaHastaCero(datos));
    }
}