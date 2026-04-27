package com.elizabeth;
import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int suma = 0;

        // 🔹 Leer números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 🔹 Sumar elementos
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        System.out.println("La suma total es: " + suma);

        sc.close();

	}

}
