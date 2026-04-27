package com.elizabeth;
import java.util.Scanner;

public class Ejercicio20 {

    // 🔹 MÉTODO
    public static boolean esPrimo(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número NO es primo");
        }

        sc.close();

	}

}
