package ejercicios;

import java.util.Scanner;

public class Ejercicio036 {

    //COMPLETAR METODO
    public void comprobarPalindromo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 5 números:");

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        boolean esPalindromo = true;

        if (numeros[0] != numeros[4]) {
            esPalindromo = false;
        }
        if (numeros[1] != numeros[3]) {
            esPalindromo = false;
        }

        if (esPalindromo == true) {
            System.out.println("¡El array ES palíndromo!");
        }
        if (esPalindromo == false) {
            System.out.println("El array NO es palíndromo.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Ejercicio036 ejercicio = new Ejercicio036();
        ejercicio.comprobarPalindromo();
    }
}