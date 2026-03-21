package integradores;

import java.util.Scanner;

public class Ejercicio28 {

    private double saldo = 1000.0;

    public double consultarSaldo() {
        return saldo;
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
        }
    }

    public boolean retirarDinero(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio28 cajero = new Ejercicio28();

        int opcion;

        do {
            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: " + cajero.consultarSaldo());
                    break;
                case 2:
                    System.out.print("Cantidad a ingresar: ");
                    double ingreso = sc.nextDouble();
                    cajero.ingresarDinero(ingreso);
                    System.out.println("Operacion realizada.");
                    break;
                case 3:
                    System.out.print("Cantidad a retirar: ");
                    double retiro = sc.nextDouble();
                    boolean ok = cajero.retirarDinero(retiro);
                    if (ok) {
                        System.out.println("Operacion realizada.");
                    } else {
                        System.out.println("No se pudo realizar la retirada.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}