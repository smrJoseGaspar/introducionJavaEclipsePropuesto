package metodos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio17Test {

    @Test
    public void probarMayorPrimero() {
        Ejercicio17 ej = new Ejercicio17();
        assertEquals(10, ej.obtenerMayor(10, 5));
    }

    @Test
    public void probarMayorSegundo() {
        Ejercicio17 ej = new Ejercicio17();
        assertEquals(8, ej.obtenerMayor(3, 8));
    }

    @Test
    public void probarNumerosIguales() {
        Ejercicio17 ej = new Ejercicio17();
        assertEquals(5, ej.obtenerMayor(5, 5));
    }
}