package secuencia;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio01Test {

    Ejercicio01 calc = new Ejercicio01();

    @Test
    public void comprobarSuma() {
        assertEquals(10.0, calc.suma(7, 3));
    }

    @Test
    public void comprobarResta() {
        assertEquals(2.0, calc.resta(5, 3));
    }

    @Test
    public void comprobarMultiplicacion() {
        assertEquals(12.0, calc.multiplicacion(4, 3));
    }

    @Test
    public void comprobarDivision() {
        assertEquals(2.0, calc.division(8, 4));
    }

    @Test
    public void comprobarDivisionEntreCero() {
        assertThrows(ArithmeticException.class, () -> calc.division(10, 0));
    }
}