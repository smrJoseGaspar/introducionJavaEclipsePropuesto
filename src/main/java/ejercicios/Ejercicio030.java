package ejercicios;

import java.util.Scanner;

public class Ejercicio030 {

    //COMPLETAR METODO
    public void procesarNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 5 números:");

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        int mayor = numeros[0];

        for (int i = 0; i < 5; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El mayor número es: " + mayor);

        scanner.close();
    }

    public static void main(String[] args) {
        Ejercicio030 ejercicio030 = new Ejercicio030();
        ejercicio030.procesarNumeros();
    }
}