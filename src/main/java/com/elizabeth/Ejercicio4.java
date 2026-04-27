package com.elizabeth;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la base del triángulo: ");
        double base = sc.nextDouble();

        System.out.print("Introduce la altura del triángulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("El área del triángulo es: " + area);

        sc.close();
	}

}
