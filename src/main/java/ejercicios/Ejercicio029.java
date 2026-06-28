package ejercicios;

import java.util.Scanner;

public class Ejercicio029 {
	
	//COMPLETAR METODO
	public void secuenciaFibonacci() {

	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Introduce el número de términos: ");
	    int n = scanner.nextInt();

	    if (n <= 0) {
	        System.out.println("Introduce un número mayor que cero.");
	        scanner.close();
	        return;
	    }

	    int a = 0;
	    int b = 1;

	    System.out.println("Secuencia Fibonacci (" + n + " términos):");

	    for (int i = 1; i <= n; i++) {

	        System.out.print(a + " ");

	        int siguiente = a + b;
	        a = b;
	        b = siguiente;
	    }

	    System.out.println();

	    scanner.close();
	}

    public static void main(String[] args) {
        Ejercicio029 ejercicio = new Ejercicio029();
        ejercicio.secuenciaFibonacci();
    }
}
