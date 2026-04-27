package com.elizabeth;
import java.util.Scanner;

public class Ejercicio37 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        boolean[] contado = new boolean[5];

        // 🔹 Leer datos
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 🔹 Contar repeticiones
        for (int i = 0; i < numeros.length; i++) {

            if (!contado[i]) {

                int contador = 1;

                for (int j = i + 1; j < numeros.length; j++) {

                    if (numeros[i] == numeros[j]) {
                        contador++;
                        contado[j] = true;
                    }
                }

                System.out.println(numeros[i] + " se repite " + contador + " veces");
            }
        }

        sc.close();

	}

}
