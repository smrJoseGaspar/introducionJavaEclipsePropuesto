package integradores;

import java.util.Scanner;

public class Ejercicio29 {

    public int[] generarFibonacci(int n) {

        if (n <= 0) {
            return new int[0];
        }

        int[] serie = new int[n];

        if (n >= 1) {
            serie[0] = 0;
        }

        if (n >= 2) {
            serie[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }

        return serie;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Introduce cantidad de terminos: ");
        n = sc.nextInt();

        Ejercicio29 obj = new Ejercicio29();
        int[] resultado = obj.generarFibonacci(n);

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }

        sc.close();
    }
}