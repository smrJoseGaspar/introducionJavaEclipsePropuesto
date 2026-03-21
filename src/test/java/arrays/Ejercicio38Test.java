package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio38Test {

    @Test
    public void probarNumeroMenor() {
        Ejercicio38 ej = new Ejercicio38();
        assertEquals("mayor", ej.comprobarNumero(10, 20));
    }

    @Test
    public void probarNumeroMayor() {
        Ejercicio38 ej = new Ejercicio38();
        assertEquals("menor", ej.comprobarNumero(30, 20));
    }

    @Test
    public void probarNumeroCorrecto() {
        Ejercicio38 ej = new Ejercicio38();
        assertEquals("correcto", ej.comprobarNumero(15, 15));
    }
}