package ejercicios;

import java.util.Scanner;

public class Ejercicio032 {
	
	//COMPLETAR METODO
	public void contarParesArray() {
	    Scanner scanner = new Scanner(System.in);
	    int[] numeros = new int[5];
	    int pares = 0;
	    System.out.println("Introduce 5 números:");
	    for (int i = 0; i < 5; i++) {
	        numeros[i] = scanner.nextInt();
	        if (numeros[i] % 2 == 0) {
	            pares++;
	        }
	    }
	    System.out.println("Hay " + pares + " números pares.");
	    scanner.close();
	}    
    public static void main(String[] args) {
        Ejercicio032 ejercicio = new Ejercicio032();
        ejercicio.contarParesArray();
    }
    
}
