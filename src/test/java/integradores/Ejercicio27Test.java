package integradores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio27Test {

    @Test
    public void probarNumeroDiez() {
        Ejercicio27 ej = new Ejercicio27();
        assertEquals("1010", ej.convertirABinario(10));
    }

    @Test
    public void probarNumeroTres() {
        Ejercicio27 ej = new Ejercicio27();
        assertEquals("11", ej.convertirABinario(3));
    }

    @Test
    public void probarNumeroCero() {
        Ejercicio27 ej = new Ejercicio27();
        assertEquals("0", ej.convertirABinario(0));
    }

    @Test
    public void probarNumeroOcho() {
        Ejercicio27 ej = new Ejercicio27();
        assertEquals("1000", ej.convertirABinario(8));
    }
}