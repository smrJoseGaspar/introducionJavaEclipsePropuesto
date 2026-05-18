package ejercicios;

import java.util.Scanner;

public class Ejercicio033 {
	
	//Adrián Navarro Buceta
	
	public void invertirArray() {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        System.out.print("Array original: ");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println();
        
        System.out.print("Array invertido: ");
        
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Ejercicio033 ejercicio = new Ejercicio033();
        ejercicio.invertirArray();
    }
    
}