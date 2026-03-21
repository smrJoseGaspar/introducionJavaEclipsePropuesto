package metodos;

import java.util.Scanner;

public class Ejercicio20 {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();

        Ejercicio20 obj = new Ejercicio20();
        boolean resultado = obj.esPrimo(numero);

        System.out.println(resultado);

        sc.close();
    }
}