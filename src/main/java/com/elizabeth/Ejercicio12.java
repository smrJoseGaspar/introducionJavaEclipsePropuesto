package com.elizabeth;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;

        System.out.println("Introduce números (0 para terminar):");

        do {
            numero = sc.nextInt();
            suma = suma + numero;
        } while (numero != 0);

        System.out.println("La suma total es: " + suma);

        sc.close();
	}

}
