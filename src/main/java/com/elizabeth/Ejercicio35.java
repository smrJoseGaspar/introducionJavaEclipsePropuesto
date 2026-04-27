package com.elizabeth;
import java.util.Scanner;

public class Ejercicio35 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int suma = 0;

        // 🔹 Leer datos
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 🔹 Sumar valores
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        // 🔹 Calcular media
        double media = (double) suma / numeros.length;

        System.out.println("La media es: " + media);

        sc.close();

	}

}
