package bucles;

import java.util.Scanner;

public class Ejercicio12 {

    public int calcularSumaHastaCero(int[] numeros) {
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                break;
            }
            suma = suma + numeros[i];
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio12 obj = new Ejercicio12();

        int[] numeros = new int[100];
        int valor;
        int i = 0;

        do {
            System.out.print("Introduce un numero (0 para terminar): ");
            valor = sc.nextInt();
            numeros[i] = valor;
            i++;
        } while (valor != 0);

        int resultado = obj.calcularSumaHastaCero(numeros);

        System.out.println("Suma total: " + resultado);

        sc.close();
    }
}