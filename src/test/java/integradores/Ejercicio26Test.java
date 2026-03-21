package integradores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio26Test {

    @Test
    public void probarCantidad() {
        Ejercicio26 ej = new Ejercicio26();
        String[] nombres = {"Ana", "Luis", "Pedro"};
        assertEquals(3, ej.contarNombres(nombres));
    }

    @Test
    public void probarMasLargo() {
        Ejercicio26 ej = new Ejercicio26();
        String[] nombres = {"Ana", "Alejandro", "Luis"};
        assertEquals("Alejandro", ej.obtenerMasLargo(nombres));
    }

    @Test
    public void probarMasCorto() {
        Ejercicio26 ej = new Ejercicio26();
        String[] nombres = {"Ana", "Alejandro", "Luis"};
        assertEquals("Ana", ej.obtenerMasCorto(nombres));
    }
}