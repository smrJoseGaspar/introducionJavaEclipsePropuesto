package ejercicios;

import java.util.Scanner;

public class Ejercicio029 {
	
	public void secuenciaFibonacci() {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        System.out.println("Secuencia Fibonacci (" + n + " términos):");
        
        int a = 0;
        int b = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }

    public static void main(String[] args) {
        Ejercicio029 ejercicio = new Ejercicio029();
        ejercicio.secuenciaFibonacci();
    }
}