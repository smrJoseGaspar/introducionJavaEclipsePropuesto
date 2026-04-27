package com.elizabeth;
import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        // 🔹 Leer números
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 🔹 Buscar el mayor
        int mayor = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);

        sc.close();

	}

}
