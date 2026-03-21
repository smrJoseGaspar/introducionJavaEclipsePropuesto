package secuencia;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio04Test {

    @Test
    public void probarAreaConEnteros() {
        Ejercicio04 ej = new Ejercicio04();
        assertEquals(12.0, ej.calcularArea(6, 4));
    }

    @Test
    public void probarAreaConDecimales() {
        Ejercicio04 ej = new Ejercicio04();
        assertEquals(7.5, ej.calcularArea(5, 3));
    }
}