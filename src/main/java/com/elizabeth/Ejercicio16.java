package com.elizabeth;
import java.util.Scanner;

public class Ejercicio16 {

    // 🔹 MÉTODO
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        // 🔹 LLAMADA AL MÉTODO
        if (esPar(numero)) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        sc.close();
	}

}
