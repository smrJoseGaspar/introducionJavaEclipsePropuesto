package integradores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio23Test {

    @Test
    public void probarFraseNormal() {
        Ejercicio23 ej = new Ejercicio23();
        assertEquals(4, ej.contarVocales("Hola mundo"));
    }

    @Test
    public void probarTodasLasVocales() {
        Ejercicio23 ej = new Ejercicio23();
        assertEquals(5, ej.contarVocales("aeiou"));
    }

    @Test
    public void probarSinVocales() {
        Ejercicio23 ej = new Ejercicio23();
        assertEquals(0, ej.contarVocales("rhythms"));
    }

    @Test
    public void probarMayusculas() {
        Ejercicio23 ej = new Ejercicio23();
        assertEquals(2, ej.contarVocales("HOLA"));
    }
}