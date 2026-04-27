package com.elizabeth;
import java.util.Scanner;

public class Ejercicio21 {

    // 🔹 MÉTODO
    public static int contarVocales(String texto) {

        int contador = 0;

        texto = texto.toLowerCase(); // pasar todo a minúsculas

        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();

        int total = contarVocales(texto);

        System.out.println("Número de vocales: " + total);

        sc.close();

	}

}
