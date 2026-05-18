package ejercicios;

import java.util.Scanner;

public class Ejercicio027 {
	
	public void decimalABinario() {
        
        Scanner scanner = new Scanner(System.in);
        
        int numero = scanner.nextInt();
        
        String binario = Integer.toBinaryString(numero);
        
        System.out.println("Binario: " + binario);
    }

    public static void main(String[] args) {
        Ejercicio027 ejercicio = new Ejercicio027();
        ejercicio.decimalABinario();
    }
}