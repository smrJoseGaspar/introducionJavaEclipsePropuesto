package ejercicios;

import java.util.Scanner;

public class Ejercicio024 {
	
	public void calculadoraNotas() {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[5];
        
        int suma = 0;
        int mayor;
        int menor;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce nota " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }
        
        mayor = notas[0];
        menor = notas[0];
        
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        
        int media = suma / notas.length;
        
        System.out.println("=== RESULTADOS ===");
        System.out.println("Media: " + media);
        System.out.println("Nota más alta: " + mayor);
        System.out.println("Nota más baja: " + menor);
        
        scanner.close();
    }

    public static void main(String[] args) {
        Ejercicio024 ejercicio = new Ejercicio024();
        ejercicio.calculadoraNotas();
    }
}