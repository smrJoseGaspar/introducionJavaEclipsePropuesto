package ejercicios;

import java.util.Scanner;

public class Ejercicio034 {
	
	//COMPLETAR METODO
	public void buscarNumeroArray() {
	    Scanner scanner = new Scanner(System.in);
	    int[] numeros = new int[5];
	    System.out.println("Introduce 5 números:");
	    for (int i = 0; i < 5; i++) {
	        numeros[i] = scanner.nextInt();
	    }
	    System.out.print("Introduce el número a buscar: ");
	    int buscar = scanner.nextInt();
	    boolean encontrado = false;
	    for (int num : numeros) {
	        if (num == buscar) {
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
