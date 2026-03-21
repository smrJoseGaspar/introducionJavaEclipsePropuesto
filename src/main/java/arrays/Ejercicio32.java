package arrays;

import java.util.Scanner;

public class Ejercicio32 {

    public int contarPares(int[] numeros) {

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Ejercicio32 obj = new Ejercicio32();
        int resultado = obj.contarPares(numeros);

        System.out.println("Cantidad de pares: " + resultado);

        sc.close();
    }
}