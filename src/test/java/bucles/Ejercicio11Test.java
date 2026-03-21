package bucles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio11Test {

    @Test
    public void probarTablaDel5() {
        Ejercicio11 ej = new Ejercicio11();
        String resultado = ej.generarTabla(5);

        assertTrue(resultado.contains("5 x 1 = 5"));
        assertTrue(resultado.contains("5 x 10 = 50"));
    }

    @Test
    public void probarTablaDel1() {
        Ejercicio11 ej = new Ejercicio11();
        String resultado = ej.generarTabla(1);

        assertTrue(resultado.contains("1 x 1 = 1"));
        assertTrue(resultado.contains("1 x 10 = 10"));
    }

    @Test
    public void probarNumeroDeLineas() {
        Ejercicio11 ej = new Ejercicio11();
        String resultado = ej.generarTabla(3);

        String[] lineas = resultado.split("\n");
        assertEquals(10, lineas.length);
    }
}