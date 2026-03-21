package bucles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio13Test {

    @Test
    public void probarPrimerPar() {
        Ejercicio13 ej = new Ejercicio13();
        int[] resultado = ej.obtenerPares();
        assertEquals(2, resultado[0]);
    }

    @Test
    public void probarUltimoPar() {
        Ejercicio13 ej = new Ejercicio13();
        int[] resultado = ej.obtenerPares();
        assertEquals(40, resultado[19]);
    }

    @Test
    public void probarCantidad() {
        Ejercicio13 ej = new Ejercicio13();
        int[] resultado = ej.obtenerPares();
        assertEquals(20, resultado.length);
    }
}