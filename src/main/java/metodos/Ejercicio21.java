package metodos;

import java.util.Scanner;

public class Ejercicio21 {

    public int contarVocales(String texto) {

        int contador = 0;

        texto = texto.toLowerCase(); // para simplificar

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || 
                letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto;

        System.out.print("Introduce un texto: ");
        texto = sc.nextLine();

        Ejercicio21 obj = new Ejercicio21();
        int resultado = obj.contarVocales(texto);

        System.out.println("Numero de vocales: " + resultado);

        sc.close();
    }
}