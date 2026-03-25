package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio026 {
	
	//COMPLETAR METODO
	public void gestorUsuarios() {
	    Scanner scanner = new Scanner(System.in);
	    List<String> usuarios = new ArrayList<>();
	    String nombre;
	    System.out.println("Introduce nombres (escribe 'fin' para terminar):");
	    while (true) {
	        nombre = scanner.nextLine();
	        if (nombre.equalsIgnoreCase("fin")) break;
	        usuarios.add(nombre);
	    }
	    if (usuarios.isEmpty()) {
	        System.out.println("No se introdujeron nombres.");
	    } else {
	        System.out.println("Cantidad de nombres: " + usuarios.size());
	        System.out.println("Lista de nombres: " + usuarios);
	    }
	    scanner.close();
	}
    public static void main(String[] args) {
        Ejercicio026 ejercicio = new Ejercicio026();
        ejercicio.gestorUsuarios();
    }
}
