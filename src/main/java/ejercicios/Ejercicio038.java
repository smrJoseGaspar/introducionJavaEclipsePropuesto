package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio038 {

    // COMPLETAR METODO: Genera numero aleatorio 1-50
    public int generarNumeroSecreto() {
        Random random = new Random();
        int numero = random.nextInt(50) + 1;
        return numero;
    }

    // COMPLETAR METODO: Compara intento con secreto y dice resultado
    public String comprobarIntento(int intento, int numeroSecreto) {
        if (intento < numeroSecreto) {
            return "¡Más alto!";
        }
        if (intento > numeroSecreto) {
            return "¡Más bajo!";
        }
        return "¡CORRECTO! El número era: " + numeroSecreto;
    }

    // COMPLETAR METODO: Funcion principal que usa ambos modulos
    public void adivinarNumero() {
        Scanner scanner = new Scanner(System.in);
        int secreto = generarNumeroSecreto();
        boolean adivinado = false;

        while (adivinado == false) {
            System.out.print("Introduce un número entre 1 y 50: ");
            int intento = scanner.nextInt();
            String resultado = comprobarIntento(intento, secreto);
            System.out.println(resultado);
            if (resultado.equals("¡CORRECTO! El número era: " + secreto) == true) {
                adivinado = true;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Ejercicio038 ejercicio = new Ejercicio038();
        ejercicio.adivinarNumero();
    }
}