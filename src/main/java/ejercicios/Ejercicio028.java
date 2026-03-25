package ejercicios;

import java.util.Scanner;

public class Ejercicio028 {
	
	private double saldo = 1000.0;  // Saldo inicial
	
	//COMPLETAR METODO
	public void cajeroAutomatico() {
	    Scanner scanner = new Scanner(System.in);
	    int opcion;
	    do {
	        System.out.println("=== CAJERO AUTOMÁTICO ===");
	        System.out.println("1. Consultar Saldo");
	        System.out.println("2. Ingresar Dinero");
	        System.out.println("3. Retirar Dinero");
	        System.out.println("0. Salir");
	        System.out.print("Opción: ");
	        opcion = scanner.nextInt();

	        switch (opcion) {
	            case 1: consultarSaldo(); break;
	            case 2: ingresarDinero(scanner); break;
	            case 3: retirarDinero(scanner); break;
	            case 0: System.out.println("¡Hasta luego!"); break;
	            default: System.out.println("Opción no válida.");
	        }
	    } while (opcion != 0);
	    scanner.close();
	}

	//COMPLETAR METODO
	private void consultarSaldo() {
	    System.out.println("Saldo actual: " + saldo);
	}

	//COMPLETAR METODO
	private void ingresarDinero(Scanner scanner) {
	    System.out.print("Cantidad a ingresar: ");
	    double cantidad = scanner.nextDouble();
	    if (cantidad > 0) {
	        saldo += cantidad;
	        System.out.println("Ingreso realizado. Nuevo saldo: " + saldo);
	    } else {
	        System.out.println("Cantidad no válida.");
	    }
	}

	//COMPLETAR METODO
	private void retirarDinero(Scanner scanner) {
	    System.out.print("Cantidad a retirar: ");
	    double cantidad = scanner.nextDouble();
	    if (cantidad > 0 && cantidad <= saldo) {
	        saldo -= cantidad;
	        System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
	    } else {
	        System.out.println("Fondos insuficientes o cantidad no válida.");
	    }
	}
    public static void main(String[] args) {
        Ejercicio028 ejercicio = new Ejercicio028();
        ejercicio.cajeroAutomatico();
    }
    
}
