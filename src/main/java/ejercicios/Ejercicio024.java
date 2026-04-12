package ejercicios;

import java.util.Scanner;

public class Ejercicio024 {

    public void calculadoraNotas() {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce nota " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }

        /*COMPLETAR*/
        int suma = 0;
        int notaMasAlta = 0;
        int notaMasBaja = 10;

        for (int i = 0; i < 5; i++) {
            suma = suma + notas[i];

            if (notas[i] > notaMasAlta) {
                notaMasAlta = notas[i];
            }
            if (notas[i] < notaMasBaja) {
                notaMasBaja = notas[i];
            }
        }

        double media = suma / 5.0;

        System.out.println("=== RESULTADOS ===");
        System.out.println("Media: " + media);
        System.out.println("Nota más alta: " + notaMasAlta);
        System.out.println("Nota más baja: " + notaMasBaja);

        scanner.close();
    }

    public static void main(String[] args) {
        Ejercicio024 ejercicio = new Ejercicio024();
        ejercicio.calculadoraNotas();
    }
}