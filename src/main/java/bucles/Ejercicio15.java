package bucles;

import java.util.Scanner;

public class Ejercicio15 {

    public int[] obtenerMultiplosDeTres(int limite) {

        int contador = 0;

        // primero contamos cuántos hay
        for (int i = 1; i <= limite; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }

        int[] resultado = new int[contador];
        int indice = 0;

        // luego los guardamos
        for (int i = 1; i <= limite; i++) {
            if (i % 3 == 0) {
                resultado[indice] = i;
                indice++;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Introduce un numero: ");
        n = sc.nextInt();

        Ejercicio15 obj = new Ejercicio15();
        int[] multiplos = obj.obtenerMultiplosDeTres(n);

        for (int i = 0; i < multiplos.length; i++) {
            System.out.print(multiplos[i] + " ");
        }

        sc.close();
    }
}