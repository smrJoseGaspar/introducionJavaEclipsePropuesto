package integradores;

import java.util.Scanner;

public class Ejercicio24 {

    public double calcularMedia(double[] notas) {
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        return suma / notas.length;
    }

    public double obtenerMayor(double[] notas) {
        double mayor = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
        }

        return mayor;
    }

    public double obtenerMenor(double[] notas) {
        double menor = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        return menor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio24 obj = new Ejercicio24();

        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        System.out.println("Media: " + obj.calcularMedia(notas));
        System.out.println("Mayor: " + obj.obtenerMayor(notas));
        System.out.println("Menor: " + obj.obtenerMenor(notas));

        sc.close();
    }
}