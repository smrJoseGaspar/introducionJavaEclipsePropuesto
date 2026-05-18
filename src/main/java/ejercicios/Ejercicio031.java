package ejercicios;

import java.util.Scanner;

public class Ejercicio031 {
	
	//Adrián Navarro Buceta
	
	public void sumarElementosArray() {
        
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }
        
        System.out.println("La suma total es: " + suma);
    }
    
    public static void main(String[] args) {
        Ejercicio031 ejercicio = new Ejercicio031();
        ejercicio.sumarElementosArray();
    }
    
}