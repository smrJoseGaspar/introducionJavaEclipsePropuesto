package ejercicios;

import java.util.Scanner;

public class Ejercicio037 {

    //COMPLETAR METODO
    public void contarRepeticiones() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 5 números:");

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int contador = 0;
            boolean yaImpreso = false;

            for (int j = 0; j < i; j++) {
                if (numeros[j] == numeros[i]) {
                    yaImpreso = true;
                }
            }

            if (yaImpreso == false) {
                for (int j = 0; j < 5; j++) {
                    if (numeros[j] == numeros[i]) {
                        contador = contador + 1;
                    }
                }
                System.out.println(numeros[i] + " se repite " + contador + " vez/veces");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Ejercicio037 ejercicio = new Ejercicio037();
        ejercicio.contarRepeticiones();
    }
}