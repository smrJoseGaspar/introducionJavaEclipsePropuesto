package com.elizabeth;
import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de términos: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Secuencia de Fibonacci:");

        for (int i = 1; i <= n; i++) {
            System.out.println(a);

            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        sc.close();

	}

}
