package seleccion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio09Test {

    @Test
    public void probarBisiestoNormal() {
        Ejercicio09 ej = new Ejercicio09();
        assertTrue(ej.esBisiesto(2024));
    }

    @Test
    public void probarNoBisiesto() {
        Ejercicio09 ej = new Ejercicio09();
        assertFalse(ej.esBisiesto(2023));
    }

    @Test
    public void probarSigloNoBisiesto() {
        Ejercicio09 ej = new Ejercicio09();
        assertFalse(ej.esBisiesto(1900));
    }

    @Test
    public void probarSigloBisiesto() {
        Ejercicio09 ej = new Ejercicio09();
        assertTrue(ej.esBisiesto(2000));
    }
}