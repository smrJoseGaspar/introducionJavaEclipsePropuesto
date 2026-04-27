package com.elizabeth;
import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo = 1000; // saldo inicial
        int opcion;

        do {
            System.out.println("\n--- CAJERO AUTOMÁTICO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Tu saldo es: " + saldo);
                    break;

                case 2:
                    System.out.print("Cantidad a ingresar: ");
                    double ingreso = sc.nextDouble();

                    if (ingreso > 0) {
                        saldo = saldo + ingreso;
                        System.out.println("Ingreso realizado. Nuevo saldo: " + saldo);
                    } else {
                        System.out.println("Cantidad no válida");
                    }
                    break;

                case 3:
                    System.out.print("Cantidad a retirar: ");
                    double retiro = sc.nextDouble();

                    if (retiro > 0 && retiro <= saldo) {
                        saldo = saldo - retiro;
                        System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente o cantidad inválida");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        sc.close();

	}

}
