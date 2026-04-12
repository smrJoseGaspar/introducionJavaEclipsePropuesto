package ejercicios;

import java.util.Scanner;

public class Ejercicio022 {

    //COMPLETAR METODO
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("=== MENÚ CALCULADORA ===");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                procesarSuma(scanner);
            }
            if (opcion == 2) {
                procesarResta(scanner);
            }
            if (opcion == 3) {
                procesarMultiplicacion(scanner);
            }
            if (opcion == 4) {
                procesarDivision(scanner);
            }
            if (opcion == 0) {
                System.out.println("¡Hasta luego!");
            }
        }
    }

    //COMPLETAR METODO
    private void procesarSuma(Scanner scanner) {
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("Resultado: " + resultado);
    }

    //COMPLETAR METODO
    private void procesarResta(Scanner scanner) {
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 - num2;
        System.out.println("Resultado: " + resultado);
    }

    //COMPLETAR METODO
    private void procesarMultiplicacion(Scanner scanner) {
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 * num2;
        System.out.println("Resultado: " + resultado);
    }

    //COMPLETAR METODO
    private void procesarDivision(Scanner scanner) {
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 / num2;
        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args) {
        Ejercicio022 ejercicio = new Ejercicio022();
        ejercicio.mostrarMenu();
    }
}