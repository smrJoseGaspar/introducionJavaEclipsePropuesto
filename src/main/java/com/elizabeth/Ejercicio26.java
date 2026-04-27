package com.elizabeth;
import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 0;
        String nombre;
        String masLargo = "";
        String masCorto = null;

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        do {
            nombre = sc.nextLine();

            if (!nombre.equalsIgnoreCase("fin")) {

                contador++;

                if (masCorto == null) {
                    masCorto = nombre;
                }

                if (nombre.length() > masLargo.length()) {
                    masLargo = nombre;
                }

                if (nombre.length() < masCorto.length()) {
                    masCorto = nombre;
                }
            }

        } while (!nombre.equalsIgnoreCase("fin"));

        System.out.println("Cantidad de nombres: " + contador);

        if (contador > 0) {
            System.out.println("Nombre más largo: " + masLargo);
            System.out.println("Nombre más corto: " + masCorto);
        }

        sc.close();

	}

}
