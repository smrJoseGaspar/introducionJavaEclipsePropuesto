package integradores;

import java.util.Scanner;

public class Ejercicio26 {

    public int contarNombres(String[] nombres) {
        return nombres.length;
    }

    public String obtenerMasLargo(String[] nombres) {

        String largo = nombres[0];

        for (int i = 1; i < nombres.length; i++) {
            if (nombres[i].length() > largo.length()) {
                largo = nombres[i];
            }
        }

        return largo;
    }

    public String obtenerMasCorto(String[] nombres) {

        String corto = nombres[0];

        for (int i = 1; i < nombres.length; i++) {
            if (nombres[i].length() < corto.length()) {
                corto = nombres[i];
            }
        }

        return corto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[100];
        int contador = 0;

        while (true) {
            System.out.print("Introduce nombre (fin para terminar): ");
            String nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            nombres[contador] = nombre;
            contador++;
        }

        // copiar solo los usados
        String[] lista = new String[contador];
        for (int i = 0; i < contador; i++) {
            lista[i] = nombres[i];
        }

        Ejercicio26 obj = new Ejercicio26();

        System.out.println("Cantidad: " + obj.contarNombres(lista));
        System.out.println("Mas largo: " + obj.obtenerMasLargo(lista));
        System.out.println("Mas corto: " + obj.obtenerMasCorto(lista));

        sc.close();
    }
}