package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio026 {
	
	//COMPLETAR METODO
	public void gestorUsuarios() {

	    Scanner scanner = new Scanner(System.in);
	    List<String> usuarios = new ArrayList<>();

	    while (true) {

	        System.out.print("Introduce un nombre (escribe 'fin' para terminar): ");
	        String nombre = scanner.nextLine();

	        if (nombre.equalsIgnoreCase("fin")) {
	            break;
	        }

	        usuarios.add(nombre);
	    }

	    if (usuarios.isEmpty()) {
	    	System.out.println("No se introdujeron nombres.");
	    } else {

	        String masLargo = usuarios.get(0);
	        String masCorto = usuarios.get(0);

	        for (String nombre : usuarios) {

	            if (nombre.length() > masLargo.length()) {
	                masLargo = nombre;
	            }

	            if (nombre.length() < masCorto.length()) {
	                masCorto = nombre;
	            }
	        }

	        System.out.println("Cantidad de nombres: " + usuarios.size());
	        System.out.println("Nombre más largo: " + masLargo);
	        System.out.println("Nombre más corto: " + masCorto);
	    }

	    scanner.close();
	}

    public static void main(String[] args) {
        Ejercicio026 ejercicio = new Ejercicio026();
        ejercicio.gestorUsuarios();
    }
}
