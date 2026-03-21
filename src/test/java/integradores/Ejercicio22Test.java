package integradores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio22Test {

    @Test
    public void probarSuma() {
        Ejercicio22 ej = new Ejercicio22();
        assertEquals(5.0, ej.calcular(1, 2, 3));
    }

    @Test
    public void probarResta() {
        Ejercicio22 ej = new Ejercicio22();
        assertEquals(1.0, ej.calcular(2, 3, 2));
    }

    @Test
    public void probarMultiplicacion() {
        Ejercicio22 ej = new Ejercicio22();
        assertEquals(6.0, ej.calcular(3, 2, 3));
    }

    @Test
    public void probarDivision() {
        Ejercicio22 ej = new Ejercicio22();
        assertEquals(2.0, ej.calcular(4, 6, 3));
    }

    @Test
    public void probarDivisionPorCero() {
        Ejercicio22 ej = new Ejercicio22();
        assertThrows(ArithmeticException.class, () -> ej.calcular(4, 5, 0));
    }
}