package ejercicios;

public class Ejercicio017 {
	
	//COMPLETAR METODO
	public int maximo(int a, int b) {
	    return (a > b) ? a : b;
	}
    public static void main(String[] args) {
    	Ejercicio017 ejercicio017 = new Ejercicio017();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Introduce primer número: ");
        int a = scanner.nextInt();
        
        System.out.print("Introduce segundo número: ");
        int b = scanner.nextInt();
        
        System.out.println("El máximo es: " + ejercicio017.maximo(a, b));
        
        scanner.close();
    }
}
