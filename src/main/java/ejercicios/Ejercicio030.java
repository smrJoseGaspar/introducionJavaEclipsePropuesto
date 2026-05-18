package ejercicios;

import java.util.Scanner;

public class Ejercicio030 {
	
	//Adrián Navarro Buceta
	
	public void procesarNumeros() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce 5 números:");
        
        int mayor = Integer.MIN_VALUE;
        
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            
            if (numero > mayor) {
                mayor = numero;
            }
        }
        
        System.out.println("El mayor número es: " + mayor);
    }
    
    public static void main(String[] args) {
    	Ejercicio030 ejercicio030 = new Ejercicio030();
    	ejercicio030.procesarNumeros();
    }
    
}