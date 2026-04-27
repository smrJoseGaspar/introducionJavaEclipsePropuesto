package com.elizabeth;
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double suma = 0;
        double nota;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Introduce la nota " + i + ": ");
            nota = sc.nextDouble();

            suma = suma + nota;

            if (nota > max) {
                max = nota;
            }

            if (nota < min) {
                min = nota;
            }
        }

        double media = suma / 5;

        System.out.println("Media: " + media);
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);

        sc.close();

	}

}
