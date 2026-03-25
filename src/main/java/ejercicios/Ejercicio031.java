package ejercicios;

import java.util.Scanner;

public class Ejercicio031 {
	
	//COMPLETAR METODO
	public void sumarElementosArray() {
	    Scanner scanner = new Scanner(System.in);
	    int[] numeros = new int[5];
	    int suma = 0;
	    System.out.println("Introduce 5 números:");
	    for (int i = 0; i < 5; i++) {
	        numeros[i] = scanner.nextInt();
	        suma += numeros[i];
	    }
	    System.out.println("La suma total es: " + suma);
	    scanner.close();
	}    
    public static void main(String[] args) {
        Ejercicio031 ejercicio = new Ejercicio031();
        ejercicio.sumarElementosArray();
    }
    
}
