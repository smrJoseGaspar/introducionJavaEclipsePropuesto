package com.elizabeth;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio38 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(50) + 1;
        int intento;

        System.out.println("Adivina el número (entre 1 y 50):");

        do {
            System.out.print("Introduce tu número: ");
            intento = sc.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor");
            } else {
                System.out.println("¡Correcto! Has adivinado el número");
            }

        } while (intento != numeroSecreto);

        sc.close();

	}

}
