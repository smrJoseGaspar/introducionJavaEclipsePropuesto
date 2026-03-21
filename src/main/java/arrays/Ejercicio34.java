package arrays;

import java.util.Scanner;

public class Ejercicio34 {

    public boolean existeNumero(int[] numeros, int buscado) {

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Numero a buscar: ");
        int buscado = sc.nextInt();

        Ejercicio34 obj = new Ejercicio34();
        boolean resultado = obj.existeNumero(numeros, buscado);

        System.out.println("Existe: " + resultado);

        sc.close();
    }
}