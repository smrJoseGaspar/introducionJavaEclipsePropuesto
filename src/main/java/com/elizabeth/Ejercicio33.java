package com.elizabeth;
import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        // 🔹 Leer datos
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 🔹 Invertir array
        for (int i = 0; i < numeros.length / 2; i++) {

            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        // 🔹 Mostrar resultado
        System.out.println("Array invertido:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();

	}

}
