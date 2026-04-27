package com.elizabeth;
import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        int numero = sc.nextInt();

        int original = numero;
        String binario = "";

        if (numero == 0) {
            binario = "0";
        } else {
            while (numero > 0) {
                int resto = numero % 2;
                binario = resto + binario;
                numero = numero / 2;
            }
        }

        System.out.println("El número decimal " + original + " en binario es: " + binario);

        sc.close();
	}

}
