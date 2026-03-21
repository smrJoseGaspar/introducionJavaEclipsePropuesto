package integradores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio24Test {

    @Test
    public void probarMedia() {
        Ejercicio24 ej = new Ejercicio24();
        double[] notas = {5, 6, 7, 8, 9};
        assertEquals(7.0, ej.calcularMedia(notas));
    }

    @Test
    public void probarMayor() {
        Ejercicio24 ej = new Ejercicio24();
        double[] notas = {4, 9, 6, 7, 5};
        assertEquals(9.0, ej.obtenerMayor(notas));
    }

    @Test
    public void probarMenor() {
        Ejercicio24 ej = new Ejercicio24();
        double[] notas = {4, 9, 6, 7, 5};
        assertEquals(4.0, ej.obtenerMenor(notas));
    }

    @Test
    public void probarNotasDecimales() {
        Ejercicio24 ej = new Ejercicio24();
        double[] notas = {6.5, 7.0, 8.5, 9.0, 5.0};
        assertEquals(7.2, ej.calcularMedia(notas));
    }
}