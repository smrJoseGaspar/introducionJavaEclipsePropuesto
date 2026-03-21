package metodos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio21Test {

    @Test
    public void probarPalabraNormal() {
        Ejercicio21 ej = new Ejercicio21();
        assertEquals(2, ej.contarVocales("hola"));
    }

    @Test
    public void probarTodasVocales() {
        Ejercicio21 ej = new Ejercicio21();
        assertEquals(5, ej.contarVocales("aeiou"));
    }

    @Test
    public void probarSinVocales() {
        Ejercicio21 ej = new Ejercicio21();
        assertEquals(0, ej.contarVocales("xyz"));
    }

    @Test
    public void probarMayusculas() {
        Ejercicio21 ej = new Ejercicio21();
        assertEquals(2, ej.contarVocales("Hola"));
    }
}