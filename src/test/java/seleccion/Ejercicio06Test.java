package seleccion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio06Test {

    @Test
    public void probarNumeroPar() {
        Ejercicio06 ej = new Ejercicio06();
        assertEquals("Par", ej.esParOImpar(10));
    }

    @Test
    public void probarNumeroImpar() {
        Ejercicio06 ej = new Ejercicio06();
        assertEquals("Impar", ej.esParOImpar(7));
    }

    @Test
    public void probarCero() {
        Ejercicio06 ej = new Ejercicio06();
        assertEquals("Par", ej.esParOImpar(0));
    }
}
