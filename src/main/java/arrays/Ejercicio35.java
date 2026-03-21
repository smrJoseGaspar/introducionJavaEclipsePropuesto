package arrays;

import java.util.Scanner;

public class Ejercicio35 {

    public double calcularMedia(int[] numeros) {

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        return (double) suma / numeros.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Ejercicio35 obj = new Ejercicio35();
        double resultado = obj.calcularMedia(numeros);

        System.out.println("Media: " + resultado);

        sc.close();
    }
}