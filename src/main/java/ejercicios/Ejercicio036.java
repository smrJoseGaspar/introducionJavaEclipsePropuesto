package ejercicios;

import java.util.Scanner;

public class Ejercicio036 {
	
	//COMPLETAR METODO
	public void comprobarPalindromo() {

	    Scanner scanner = new Scanner(System.in);

	    int[] numeros = new int[5];

	    for (int i = 0; i < numeros.length; i++) {
	        System.out.print("Introduce el número " + (i + 1) + ": ");
	        numeros[i] = scanner.nextInt();
	    }

	    boolean palindromo = true;

	    for (int i = 0; i < numeros.length / 2; i++) {

	        if (numeros[i] != numeros[numeros.length - 1 - i]) {
	            palindromo = false;
	            break;
	        }
	    }

	    if (palindromo) {
	    	System.out.print("¡El array ES palíndromo!");
	    } else {
	    	System.out.println("El array NO es palíndromo.");
	    }

	    scanner.close();
	}
    
    public static void main(String[] args) {
        Ejercicio036 ejercicio = new Ejercicio036();
        ejercicio.comprobarPalindromo();
    }
    
}
