package integradores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio28Test {

    @Test
    public void probarSaldoInicial() {
        Ejercicio28 cajero = new Ejercicio28();
        assertEquals(1000.0, cajero.consultarSaldo());
    }

    @Test
    public void probarIngreso() {
        Ejercicio28 cajero = new Ejercicio28();
        cajero.ingresarDinero(200);
        assertEquals(1200.0, cajero.consultarSaldo());
    }

    @Test
    public void probarRetiradaCorrecta() {
        Ejercicio28 cajero = new Ejercicio28();
        boolean resultado = cajero.retirarDinero(300);
        assertTrue(resultado);
        assertEquals(700.0, cajero.consultarSaldo());
    }

    @Test
    public void probarRetiradaExcesiva() {
        Ejercicio28 cajero = new Ejercicio28();
        boolean resultado = cajero.retirarDinero(1500);
        assertFalse(resultado);
        assertEquals(1000.0, cajero.consultarSaldo());
    }

    @Test
    public void probarIngresoNegativo() {
        Ejercicio28 cajero = new Ejercicio28();
        cajero.ingresarDinero(-50);
        assertEquals(1000.0, cajero.consultarSaldo());
    }
}