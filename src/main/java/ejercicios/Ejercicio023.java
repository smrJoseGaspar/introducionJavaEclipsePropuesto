package ejercicios;

import java.util.Scanner;

public class Ejercicio023 {

    //COMPLETAR METODO
    public void contarVocales() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase:");
        String frase = scanner.nextLine();
        int vocales = contarVocalesEnFrase(frase);
        System.out.println("La frase tiene " + vocales + " vocales.");
    }

    //COMPLETAR METODO
    private int contarVocalesEnFrase(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a') {
                contador = contador + 1;
            }
            if (letra == 'e') {
                contador = contador + 1;
            }
            if (letra == 'i') {
                contador = contador + 1;
            }
            if (letra == 'o') {
                contador = contador + 1;
            }
            if (letra == 'u') {
                contador = contador + 1;
            }
            if (letra == 'A') {
                contador = contador + 1;
            }
            if (letra == 'E') {
                contador = contador + 1;
            }
            if (letra == 'I') {
                contador = contador + 1;
            }
            if (letra == 'O') {
                contador = contador + 1;
            }
            if (letra == 'U') {
                contador = contador + 1;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Ejercicio023 ejercicio = new Ejercicio023();
        ejercicio.contarVocales();
    }
}