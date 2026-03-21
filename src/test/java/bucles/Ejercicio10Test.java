package bucles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio10Test {

    @Test
    public void probarMayorPrimero() {
        Ejercicio10 ej = new Ejercicio10();
        assertEquals(10, ej.obtenerMayor(10, 5, 3));
    }

    @Test
    public void probarMayorSegundo() {
        Ejercicio10 ej = new Ejercicio10();
        assertEquals(8, ej.obtenerMayor(4, 8, 2));
    }

    @Test
    public void probarMayorTercero() {
        Ejercicio10 ej = new Ejercicio10();
        assertEquals(9, ej.obtenerMayor(1, 3, 9));
    }

    @Test
    public void probarNumerosIguales() {
        Ejercicio10 ej = new Ejercicio10();
        assertEquals(5, ej.obtenerMayor(5, 5, 5));
    }
}