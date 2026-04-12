package ejercicios;

import java.util.Scanner;

public class Ejercicio034 {

    //COMPLETAR METODO
    public void buscarNumeroArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 5 números:");

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.print("¿Qué número quieres buscar? ");
        int buscar = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < 5; i++) {
            if (numeros[i] == buscar) {
                encontrado = true;
            }
        }

        if (encontrado == true) {
            System.out.println("¡El número " + buscar + " SÍ existe en el array!");
        }
        if (encontrado == false) {
            System.out.println("El número " + buscar + " NO existe en el array.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Ejercicio034 ejercicio = new Ejercicio034();
        ejercicio.buscarNumeroArray();
    }
}