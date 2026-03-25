package ejercicios;

import java.util.Scanner;

public class Ejercicio033 {
	
	//COMPLETAR METODO
	public void invertirArray() {
	    Scanner scanner = new Scanner(System.in);
	    int[] numeros = new int[5];
	    System.out.println("Introduce 5 números:");
	    for (int i = 0; i < 5; i++) {
	        numeros[i] = scanner.nextInt();
	    }
	    System.out.print("Array original: ");
	    for (int i = 0; i < 5; i++) {
	        System.out.print(numeros[i] + (i == 4 ? "" : " "));
	    }
	    System.out.println();

	    System.out.print("Array invertido: ");
	    for (int i = 4; i >= 0; i--) {
	        System.out.print(numeros[i] + (i == 0 ? "" : " "));
	    }
	    System.out.println();
	    scanner.close();
	}    
    public static void main(String[] args) {
        Ejercicio033 ejercicio = new Ejercicio033();
        ejercicio.invertirArray();
    }
    
}
