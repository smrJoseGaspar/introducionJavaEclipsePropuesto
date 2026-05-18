package ejercicios;

import java.util.Scanner;

public class Ejercicio035 {
	
	//Adrián Navarro Buceta
	
	public void calcularMediaArray() {
		
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }
        
        int media = suma / numeros.length;
        
        System.out.println("La media es: " + media);
    }
    
    public static void main(String[] args) {
        Ejercicio035 ejercicio = new Ejercicio035();
        ejercicio.calcularMediaArray();
    }
}