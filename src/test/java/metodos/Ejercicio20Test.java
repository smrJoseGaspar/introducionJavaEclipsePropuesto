package metodos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio20Test {

    @Test
    public void probarNumeroPrimo() {
        Ejercicio20 ej = new Ejercicio20();
        assertTrue(ej.esPrimo(7));
    }

    @Test
    public void probarNumeroNoPrimo() {
        Ejercicio20 ej = new Ejercicio20();
        assertFalse(ej.esPrimo(8));
    }

    @Test
    public void probarUno() {
        Ejercicio20 ej = new Ejercicio20();
        assertFalse(ej.esPrimo(1));
    }

    @Test
    public void probarDos() {
        Ejercicio20 ej = new Ejercicio20();
        assertTrue(ej.esPrimo(2));
    }
}