package ejercicios;

import java.util.Scanner;

public class Ejercicio030 {
	
	//COMPLETAR METODO
	public void procesarNumeros() {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Introduce 5 números:");
	    int max = Integer.MIN_VALUE;
	    for (int i = 0; i < 5; i++) {
	        System.out.print("Número " + (i + 1) + ": ");
	        int num = scanner.nextInt();
	        if (num > max) {
	            max = num;
	        }
	    }
	    System.out.println("El mayor número es: " + max);
	    scanner.close();
	}    
    public static void main(String[] args) {
    	Ejercicio030 ejercicio030 = new Ejercicio030();
    	ejercicio030.procesarNumeros();
    }
    
}
