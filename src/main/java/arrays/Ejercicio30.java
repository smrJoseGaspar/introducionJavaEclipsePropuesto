package arrays;

import java.util.Scanner;

public class Ejercicio30 {

    public int buscarMayor(int[] numeros) {

        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Ejercicio30 obj = new Ejercicio30();
        int resultado = obj.buscarMayor(numeros);

        System.out.println("El mayor es: " + resultado);

        sc.close();
    }
}