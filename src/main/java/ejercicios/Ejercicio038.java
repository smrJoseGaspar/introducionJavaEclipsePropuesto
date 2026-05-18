package ejercicios;

public class Ejercicio038 {
	
	//Adrián Navarro Buceta
	
	// Genera número aleatorio entre 1 y 50
    public int generarNumeroSecreto() {
    	return (int)(Math.random() * 50) + 1;
    }
    
    // Compara intento con el número secreto
    public String comprobarIntento(int intento, int numeroSecreto) {
    	
    	if (intento < numeroSecreto) {
    		return "¡Más alto!";
    	} else if (intento > numeroSecreto) {
    		return "¡Más bajo!";
    	} else {
    		return "¡CORRECTO! El número era: " + numeroSecreto;
    	}
    }

    // Juego principal
    public void adivinarNumero() {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        int numeroSecreto = generarNumeroSecreto();
        int intento;
        String resultado;
        
        do {
            System.out.print("Introduce un número: ");
            intento = scanner.nextInt();
            
            resultado = comprobarIntento(intento, numeroSecreto);
            System.out.println(resultado);
            
        } while (intento != numeroSecreto);
        
        scanner.close();
    }
    
    public static void main(String[] args) {
        Ejercicio038 ejercicio = new Ejercicio038();
        ejercicio.adivinarNumero();
    }
}