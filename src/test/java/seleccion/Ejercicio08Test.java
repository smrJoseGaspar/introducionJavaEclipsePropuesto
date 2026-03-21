package seleccion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio08Test {

    @Test
    public void probarLunes() {
        Ejercicio08 ej = new Ejercicio08();
        assertEquals("Lunes", ej.obtenerDia(1));
    }

    @Test
    public void probarMiercoles() {
        Ejercicio08 ej = new Ejercicio08();
        assertEquals("Miercoles", ej.obtenerDia(3));
    }

    @Test
    public void probarDomingo() {
        Ejercicio08 ej = new Ejercicio08();
        assertEquals("Domingo", ej.obtenerDia(7));
    }

    @Test
    public void probarNumeroInvalido() {
        Ejercicio08 ej = new Ejercicio08();
        assertEquals("Numero no valido", ej.obtenerDia(10));
    }
}