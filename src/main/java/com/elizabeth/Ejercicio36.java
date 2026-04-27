package com.elizabeth;
import java.util.Scanner;

public class Ejercicio36 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        boolean esPalindromo = true;

        // 🔹 Leer datos
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 🔹 Comprobar palíndromo
        for (int i = 0; i < numeros.length / 2; i++) {

            if (numeros[i] != numeros[numeros.length - 1 - i]) {
                esPalindromo = false;
                break;
            }
        }

        // 🔹 Resultado
        if (esPalindromo) {
            System.out.println("El array es palíndromo");
        } else {
            System.out.println("El array NO es palíndromo");
        }

        sc.close();

	}

}
