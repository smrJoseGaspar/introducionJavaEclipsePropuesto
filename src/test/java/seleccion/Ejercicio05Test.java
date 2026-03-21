package seleccion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio05Test {

    @Test
    public void probarPositivo() {
        Ejercicio05 ej = new Ejercicio05();
        assertEquals("Positivo", ej.comprobarNumero(5));
    }

    @Test
    public void probarNegativo() {
        Ejercicio05 ej = new Ejercicio05();
        assertEquals("Negativo", ej.comprobarNumero(-3));
    }

    @Test
    public void probarCero() {
        Ejercicio05 ej = new Ejercicio05();
        assertEquals("Cero", ej.comprobarNumero(0));
    }
}