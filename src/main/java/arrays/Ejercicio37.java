package arrays;

import java.util.Scanner;

public class Ejercicio37 {

    public int[][] contarRepeticiones(int[] numeros) {

        boolean[] visitado = new boolean[numeros.length];
        int[][] resultado = new int[numeros.length][2];
        int indice = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (visitado[i]) {
                continue;
            }

            int contador = 1;

            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                    visitado[j] = true;
                }
            }

            resultado[indice][0] = numeros[i]; // número
            resultado[indice][1] = contador;   // veces
            indice++;
        }

        // recortar array
        int[][] finalResultado = new int[indice][2];
        for (int i = 0; i < indice; i++) {
            finalResultado[i] = resultado[i];
        }

        return finalResultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Ejercicio37 obj = new Ejercicio37();
        int[][] resultado = obj.contarRepeticiones(numeros);

        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i][0] + " aparece " + resultado[i][1] + " veces");
        }

        sc.close();
    }
}