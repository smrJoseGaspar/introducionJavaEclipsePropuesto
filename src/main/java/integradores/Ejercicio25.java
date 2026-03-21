package integradores;

import java.util.Scanner;

public class Ejercicio25 {

    public boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int[] obtenerPrimosHasta(int n) {

        int contador = 0;

        // contar primos
        for (int i = 1; i <= n; i++) {
            if (esPrimo(i)) {
                contador++;
            }
        }

        int[] primos = new int[contador];
        int indice = 0;

        // guardar primos
        for (int i = 1; i <= n; i++) {
            if (esPrimo(i)) {
                primos[indice] = i;
                indice++;
            }
        }

        return primos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Introduce un numero: ");
        n = sc.nextInt();

        Ejercicio25 obj = new Ejercicio25();
        int[] resultado = obj.obtenerPrimosHasta(n);

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }

        sc.close();
    }
}