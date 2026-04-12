package ejercicios;

import java.util.Scanner;

public class Ejercicio025 {

    //COMPLETAR METODO
    public void numerosPrimosHastaN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        System.out.print("Números primos hasta " + n + ": ");

        String resultado = "";
        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) {
                resultado = resultado + i + " ";
            }
        }

        System.out.println(resultado);

        scanner.close();
    }

    //COMPLETAR METODO
    private boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Ejercicio025 ejercicio = new Ejercicio025();
        ejercicio.numerosPrimosHastaN();
    }
}