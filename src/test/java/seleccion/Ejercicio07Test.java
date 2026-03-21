package seleccion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio07Test {

    @Test
    public void probarInsuficiente() {
        Ejercicio07 ej = new Ejercicio07();
        assertEquals("Insuficiente", ej.clasificarNota(3));
    }

    @Test
    public void probarSuficiente() {
        Ejercicio07 ej = new Ejercicio07();
        assertEquals("Suficiente", ej.clasificarNota(5));
    }

    @Test
    public void probarBien() {
        Ejercicio07 ej = new Ejercicio07();
        assertEquals("Bien", ej.clasificarNota(6));
    }

    @Test
    public void probarNotable() {
        Ejercicio07 ej = new Ejercicio07();
        assertEquals("Notable", ej.clasificarNota(8));
    }

    @Test
    public void probarSobresaliente() {
        Ejercicio07 ej = new Ejercicio07();
        assertEquals("Sobresaliente", ej.clasificarNota(10));
    }

    @Test
    public void probarNotaInvalida() {
        Ejercicio07 ej = new Ejercicio07();
        assertEquals("Nota no valida", ej.clasificarNota(15));
    }
}
