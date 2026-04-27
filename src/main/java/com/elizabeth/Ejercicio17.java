package com.elizabeth;
import java.util.Scanner;

public class Ejercicio17 {

    // 🔹 MÉTODO
    public static int maximo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        int mayor = maximo(num1, num2);

        System.out.println("El número mayor es: " + mayor);

        sc.close();
	}

}
