package metodos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio16Test {

    @Test
    public void probarNumeroPar() {
        Ejercicio16 ej = new Ejercicio16();
        assertTrue(ej.comprobarPar(8));
    }

    @Test
    public void probarNumeroImpar() {
        Ejercicio16 ej = new Ejercicio16();
        assertFalse(ej.comprobarPar(5));
    }

    @Test
    public void probarCero() {
        Ejercicio16 ej = new Ejercicio16();
        assertTrue(ej.comprobarPar(0));
    }
}