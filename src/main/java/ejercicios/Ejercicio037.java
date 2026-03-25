package ejercicios;

public class Ejercicio037 {
	
	//COMPLETAR METODO
	public void contarRepeticiones() {
	    java.util.Scanner scanner = new java.util.Scanner(System.in);
	    int[] numeros = new int[5];
	    System.out.println("Introduce 5 números:");
	    for (int i = 0; i < 5; i++) {
	        numeros[i] = scanner.nextInt();
	    }

	    boolean[] visitado = new boolean[5];
	    for (int i = 0; i < 5; i++) {
	        if (visitado[i]) continue;
	        int count = 1;
	        for (int j = i + 1; j < 5; j++) {
	            if (numeros[i] == numeros[j]) {
	                visitado[j] = true;
	                count++;
	            }
	        }
	        System.out.println(numeros[i] + " se repite " + count + " vez/veces");
	    }
	    scanner.close();
	}    
    public static void main(String[] args) {
        Ejercicio037 ejercicio = new Ejercicio037();
        ejercicio.contarRepeticiones();
    }
}
