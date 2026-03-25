package ejercicios;

import java.util.Scanner;

public class Ejercicio035 {
	
	//COMPLETAR METODO
	public void calcularMediaArray() {
	    Scanner scanner = new Scanner(System.in);
	    int[] numeros = new int[5];
	    int suma = 0;
	    System.out.println("Introduce 5 números:");
	    for (int i = 0; i < 5; i++) {
	        numeros[i] = scanner.nextInt();
	        suma += numeros[i];
	    }
	    double media = suma / 5.0;
	    System.out.println("La media es: " + media);
	    scanner.close();
	}    
    public static void main(String[] args) {
        Ejercicio035 ejercicio = new Ejercicio035();
        ejercicio.calcularMediaArray();
    }
}
