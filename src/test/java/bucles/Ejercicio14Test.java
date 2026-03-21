package bucles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio14Test {

    @Test
    public void probarFactorialPequeno() {
        Ejercicio14 ej = new Ejercicio14();
        assertEquals(120, ej.calcularFactorial(5));
    }

    @Test
    public void probarFactorialUno() {
        Ejercicio14 ej = new Ejercicio14();
        assertEquals(1, ej.calcularFactorial(1));
    }

    @Test
    public void probarFactorialCero() {
        Ejercicio14 ej = new Ejercicio14();
        assertEquals(1, ej.calcularFactorial(0));
    }
}
