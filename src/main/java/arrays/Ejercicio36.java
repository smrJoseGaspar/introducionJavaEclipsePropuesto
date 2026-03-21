package arrays;

import java.util.Scanner;

public class Ejercicio36 {

    public boolean esPalindromo(int[] numeros) {

        int inicio = 0;
        int fin = numeros.length - 1;

        while (inicio < fin) {

            if (numeros[inicio] != numeros[fin]) {
                return false;
            }

            inicio++;
            fin--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Ejercicio36 obj = new Ejercicio36();
        boolean resultado = obj.esPalindromo(numeros);

        System.out.println("Es palindromo: " + resultado);

        sc.close();
    }
}