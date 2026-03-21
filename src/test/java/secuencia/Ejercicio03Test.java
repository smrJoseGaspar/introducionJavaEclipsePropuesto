package secuencia;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio03Test {

    @Test
    public void probarConversionCero() {
        Ejercicio03 ej = new Ejercicio03();
        assertEquals(32.0, ej.convertirAFahrenheit(0));
    }

    @Test
    public void probarConversionPositiva() {
        Ejercicio03 ej = new Ejercicio03();
        assertEquals(68.0, ej.convertirAFahrenheit(20));
    }

    @Test
    public void probarConversionNegativa() {
        Ejercicio03 ej = new Ejercicio03();
        assertEquals(14.0, ej.convertirAFahrenheit(-10));
    }
}