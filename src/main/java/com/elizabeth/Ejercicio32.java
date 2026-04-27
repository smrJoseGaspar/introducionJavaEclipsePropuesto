package com.elizabeth;
import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int contador = 0;

        // 🔹 Leer números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 🔹 Contar pares
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }

        System.out.println("Cantidad de números pares: " + contador);

        sc.close();

	}

}
