package arrays;

import java.util.Scanner;

public class Ejercicio33 {

    public void invertirArray(int[] numeros) {

        int inicio = 0;
        int fin = numeros.length - 1;

        while (inicio < fin) {

            int temp = numeros[inicio];
            numeros[inicio] = numeros[fin];
            numeros[fin] = temp;

            inicio++;
            fin--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Ejercicio33 obj = new Ejercicio33();
        obj.invertirArray(numeros);

        System.out.print("Array invertido: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}