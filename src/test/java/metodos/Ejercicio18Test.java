package metodos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio18Test {

    @Test
    public void probarSaludoSimple() {
        Ejercicio18 ej = new Ejercicio18();
        assertEquals("Hola Ana", ej.crearSaludo("Ana"));
    }

    @Test
    public void probarOtroNombre() {
        Ejercicio18 ej = new Ejercicio18();
        assertEquals("Hola Carlos", ej.crearSaludo("Carlos"));
    }

    @Test
    public void probarNombreVacio() {
        Ejercicio18 ej = new Ejercicio18();
        assertEquals("Hola ", ej.crearSaludo(""));
    }
}