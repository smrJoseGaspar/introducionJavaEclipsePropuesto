package ejercicios;

import java.util.Scanner;

public class Ejercicio028 {

    private double saldo = 1000.0;  // Saldo inicial

  //COMPLETAR METODO
    public void cajeroAutomatico() {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("=== CAJERO AUTOMATICO ===");
            consultarSaldo();  // Muestra saldo al inicio de cada vuelta
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                consultarSaldo();
            }
            if (opcion == 2) {
                ingresarDinero(scanner);
            }
            if (opcion == 3) {
                retirarDinero(scanner);
            }
            if (opcion == 0) {
                System.out.println("¡Hasta luego!");
            }
        }

        scanner.close();
    }

    //COMPLETAR METODO
    private void consultarSaldo() {
        System.out.println("Saldo actual: " + (int)saldo);
    }

    //COMPLETAR METODO
    private void ingresarDinero(Scanner scanner) {
        System.out.print("¿Cuánto desea ingresar? ");
        double cantidad = scanner.nextDouble();
        saldo = saldo + cantidad;
        System.out.println("Ingreso realizado. Nuevo saldo: " + (int)saldo);
    }

    //COMPLETAR METODO
    private void retirarDinero(Scanner scanner) {
        System.out.print("¿Cuánto desea retirar? ");
        double cantidad = scanner.nextDouble();
        saldo = saldo - cantidad;
        System.out.println("Retiro realizado. Nuevo saldo: " + (int)saldo);
    }

    public static void main(String[] args) {
        Ejercicio028 ejercicio = new Ejercicio028();
        ejercicio.cajeroAutomatico();
    }
}