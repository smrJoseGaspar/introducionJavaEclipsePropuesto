package bucles;

import java.util.Scanner;

public class Ejercicio14 {

    public long calcularFactorial(int numero) {

        long resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();

        Ejercicio14 obj = new Ejercicio14();
        long fact = obj.calcularFactorial(numero);

        System.out.println("Factorial: " + fact);

        sc.close();
    }
}