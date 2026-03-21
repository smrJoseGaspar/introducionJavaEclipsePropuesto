package metodos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio19Test {

    @Test
    public void probarPotenciaNormal() {
        Ejercicio19 ej = new Ejercicio19();
        assertEquals(8, ej.calcularPotencia(2, 3));
    }

    @Test
    public void probarExponenteCero() {
        Ejercicio19 ej = new Ejercicio19();
        assertEquals(1, ej.calcularPotencia(5, 0));
    }

    @Test
    public void probarBaseUno() {
        Ejercicio19 ej = new Ejercicio19();
        assertEquals(1, ej.calcularPotencia(1, 10));
    }
}