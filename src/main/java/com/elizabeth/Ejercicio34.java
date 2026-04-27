package com.elizabeth;
import java.util.Scanner;

public class Ejercicio34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        boolean encontrado = false;

        // 🔹 Leer datos
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 🔹 Número a buscar
        System.out.print("Introduce el número a buscar: ");
        int buscar = sc.nextInt();

        // 🔹 Buscar en el array
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == buscar) {
                encontrado = true;
                break; // salir del bucle
            }
        }

        // 🔹 Resultado
        if (encontrado) {
            System.out.println("El número existe en el array");
        } else {
            System.out.println("El número NO existe en el array");
        }

        sc.close();

	}

}
