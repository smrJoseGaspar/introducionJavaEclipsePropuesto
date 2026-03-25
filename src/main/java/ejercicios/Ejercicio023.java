package ejercicios;

import java.util.Scanner;

public class Ejercicio023 {
	
	//COMPLETAR METODO
	public void contarVocales() {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Introduce una frase: ");
	    String frase = scanner.nextLine();
	    int count = contarVocalesEnFrase(frase);
	    System.out.println("La frase tiene " + count + " vocales.");
	    scanner.close();
	}
	//COMPLETAR METODO
	private int contarVocalesEnFrase(String frase) {
	    if (frase == null) return 0;
	    int count = 0;
	    String vocales = "aeiouAEIOU";
	    for (char c : frase.toCharArray()) {
	        if (vocales.indexOf(c) != -1) {
	            count++;
	        }
	    }
	    return count;
	}    

    public static void main(String[] args) {
        Ejercicio023 ejercicio = new Ejercicio023();
        ejercicio.contarVocales();
    }
}
