package ejercicios;

public class Ejercicio020 {
	
	//COMPLETAR METODO
	public boolean esPrimo(int n) {
	    if (n <= 1) return false;
	    if (n <= 3) return true;
	    if (n % 2 == 0 || n % 3 == 0) return false;
	    for (int i = 5; i * i <= n; i = i + 6) {
	        if (n % i == 0 || n % (i + 2) == 0)
	            return false;
	    }
	    return true;
	}
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Ejercicio020 ejercicio = new Ejercicio020();
        
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        System.out.println(numero + " " + 
            (ejercicio.esPrimo(numero) ? "ES primo" : "NO es primo"));
        
        scanner.close();
    }
}
