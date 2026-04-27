package com.elizabeth;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce grados Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("Grados Fahrenheit: " + fahrenheit);

        sc.close();

	}

}
