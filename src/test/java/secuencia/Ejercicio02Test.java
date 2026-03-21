package secuencia;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio02Test {

    @Test
    public void probarMensaje() {
        Ejercicio02 ej = new Ejercicio02();
        String resultado = ej.construirMensaje("Luis", 52);
        assertEquals("Hola Luis, tienes 52 años.", resultado);
    }
}