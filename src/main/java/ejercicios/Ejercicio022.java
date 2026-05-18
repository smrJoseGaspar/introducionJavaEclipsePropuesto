package ejercicios;

import java.util.Scanner;

//Adrián Navarro Buceta

public class Ejercicio022 {
	
	public void mostrarMenu() {
		
		Scanner scanner = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("=== MENÚ CALCULADORA ===");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("0. Salir");
			
			opcion = scanner.nextInt();
			
			switch (opcion) {
				case 1:
					procesarSuma(scanner);
					break;
				case 2:
					procesarResta(scanner);
					break;
				case 3:
					procesarMultiplicacion(scanner);
					break;
				case 4:
					procesarDivision(scanner);
					break;
				case 0:
					System.out.println("¡Hasta luego!");
					break;
				default:
					System.out.println("Opción no válida");
			}
			
		} while (opcion != 0);
	}
        
    private void procesarSuma(Scanner scanner) {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        
        System.out.println("Resultado: " + (a + b));
    }
    
    private void procesarResta(Scanner scanner) {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        
        System.out.println("Resultado: " + (a - b));
    }
    
    private void procesarMultiplicacion(Scanner scanner) {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        
        System.out.println("Resultado: " + (a * b));
    }
    
    private void procesarDivision(Scanner scanner) {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        
        if (b == 0) {
            System.out.println("No se puede dividir entre cero");
        } else {
            System.out.println("Resultado: " + (a / b));
        }
    }
    
    public static void main(String[] args) {
        Ejercicio022 ejercicio = new Ejercicio022();
        ejercicio.mostrarMenu();
    }
}