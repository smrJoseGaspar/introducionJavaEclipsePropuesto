package ejercicios;

import java.util.Scanner;

public class Ejercicio028 {
	
	private double saldo = 1000.0;  // Saldo inicial
	
    public void cajeroAutomatico() {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Saldo actual: " + (int) saldo);
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("0. Salir");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    ingresarDinero(scanner);
                    break;
                case 3:
                    retirarDinero(scanner);
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            
        } while (opcion != 0);
    }
    
    private void consultarSaldo() {
        System.out.println("Saldo actual: " + (int) saldo);
    }
    
    private void ingresarDinero(Scanner scanner) {
        
        double cantidad = scanner.nextDouble();
        
        saldo += cantidad;
        
        System.out.println("Ingreso realizado. Nuevo saldo: " + (int) saldo);
    }
    
    private void retirarDinero(Scanner scanner) {
        
        double cantidad = scanner.nextDouble();
        
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: " + (int) saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public static void main(String[] args) {
        Ejercicio028 ejercicio = new Ejercicio028();
        ejercicio.cajeroAutomatico();
    }
    
}