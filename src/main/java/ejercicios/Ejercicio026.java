package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio026 {

    //COMPLETAR METODO
    public void gestorUsuarios() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<String>();

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        String nombre = scanner.nextLine();

        while (nombre.equals("fin") == false) {
            nombres.add(nombre);
            nombre = scanner.nextLine();
        }

        if (nombres.size() == 0) {
            System.out.println("No se introdujeron nombres.");
        } else {
            System.out.println("Cantidad de nombres: " + nombres.size());
            System.out.println("Lista de nombres:");
            for (int i = 0; i < nombres.size(); i++) {
                System.out.println(nombres.get(i));
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Ejercicio026 ejercicio = new Ejercicio026();
        ejercicio.gestorUsuarios();
    }
}