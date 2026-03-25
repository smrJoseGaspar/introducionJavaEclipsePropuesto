package ejercicios;

import java.util.Scanner;

public class Ejercicio027 {
	
	//COMPLETAR METODO
	public void decimalABinario() {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Introduce un número decimal: ");
	    int decimal = scanner.nextInt();
	    String binario = Integer.toBinaryString(decimal);
	    System.out.println("Binario: " + binario);
	    scanner.close();
	}
    public static void main(String[] args) {
        Ejercicio027 ejercicio = new Ejercicio027();
        ejercicio.decimalABinario();
    }
}
