package com.elizabeth;
import java.util.Scanner;

public class Ejercicio25 {

    // 🔹 MÉTODO reutilizado
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

        System.out.print("Introduce un número N: ");
        int n = sc.nextInt();

        System.out.println("Números primos entre 1 y " + n + ":");

        for (int i = 1; i <= n; i++) {

            if (esPrimo(i)) {
                System.out.println(i);
            }
        }

        sc.close();
	}

}
