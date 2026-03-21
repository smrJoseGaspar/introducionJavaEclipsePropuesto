package arrays;

import java.util.Scanner;

public class Ejercicio31 {

    public int calcularSuma(int[] numeros) {

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Ejercicio31 obj = new Ejercicio31();
        int resultado = obj.calcularSuma(numeros);

        System.out.println("Suma total: " + resultado);

        sc.close();
    }
}