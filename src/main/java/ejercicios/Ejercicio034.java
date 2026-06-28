package ejercicios;

import java.util.Scanner;

public class Ejercicio034 {
	
	//COMPLETAR METODO
	public void buscarNumeroArray() {

	    Scanner scanner = new Scanner(System.in);

	    int[] numeros = new int[5];

	    for (int i = 0; i < numeros.length; i++) {
	        System.out.print("Introduce el número " + (i + 1) + ": ");
	        numeros[i] = scanner.nextInt();
	    }

	    System.out.print("Introduce el número que deseas buscar: ");
	    int buscar = scanner.nextInt();

	    boolean encontrado = false;

	    for (int i = 0; i < numeros.length; i++) {
	        if (numeros[i] == buscar) {
	            encontrado = true;
	            break;
	        }
	    }

	    if (encontrado) {
	        System.out.println("¡El número " + buscar + " SÍ existe en el array!");
	    } else {
	    	System.out.println("El número " + buscar + " NO existe en el array.");
	    }

	    scanner.close();
	}
    
    public static void main(String[] args) {
        Ejercicio034 ejercicio = new Ejercicio034();
        ejercicio.buscarNumeroArray();
    }
    
}
