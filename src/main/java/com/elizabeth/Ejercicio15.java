package com.elizabeth;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        System.out.println("Múltiplos de 3 entre 1 y " + n + ":");

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
	}

}
