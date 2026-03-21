package integradores;

import java.util.Scanner;

public class Ejercicio23 {

    public int contarVocales(String texto) {
        int contador = 0;
        texto = texto.toLowerCase();

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

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        Ejercicio23 obj = new Ejercicio23();
        int resultado = obj.contarVocales(frase);

        System.out.println("Numero de vocales: " + resultado);

        sc.close();
    }
}