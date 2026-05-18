package ejercicios;

public class Ejercicio013 {
	
	public void mostrarPrimeros20Pares() {
        
        System.out.println("Los primeros veinte números pares:");
        
        for (int i = 1; i <= 20; i++) {
            System.out.print((i * 2) + " ");
        }
    }

    public static void main(String[] args) {
    	Ejercicio013 ejercicio013 = new Ejercicio013();
    	ejercicio013.mostrarPrimeros20Pares();
    }
}