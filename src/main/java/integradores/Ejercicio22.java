package integradores;

import java.util.Scanner;

public class Ejercicio22 {

    public double calcular(int opcion, double a, double b) {

        switch (opcion) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                if (b == 0) {
                    throw new ArithmeticException("Division por cero");
                }
                return a / b;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio22 obj = new Ejercicio22();

        int opcion;

        do {
            System.out.println("\n1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");

            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            if (opcion != 0) {
                System.out.print("Numero 1: ");
                double a = sc.nextDouble();

                System.out.print("Numero 2: ");
                double b = sc.nextDouble();

                double resultado = obj.calcular(opcion, a, b);
                System.out.println("Resultado: " + resultado);
            }

        } while (opcion != 0);

        sc.close();
    }
}