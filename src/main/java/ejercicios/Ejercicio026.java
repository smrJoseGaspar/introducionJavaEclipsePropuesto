package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio026 {
	
	//Adrian Navarro Buceta
	
	public void gestorUsuarios() {
        
        Scanner scanner = new Scanner(System.in);
        List<String> nombres = new ArrayList<>();
        
        String nombre;
        
        while (true) {
            nombre = scanner.nextLine();
            
            if (nombre.equals("fin")) {
                break;
            }
            
            nombres.add(nombre);
        }
        
        if (nombres.isEmpty()) {
            System.out.println("No se introdujeron nombres.");
        } else {
            System.out.println("Cantidad de nombres: " + nombres.size());
            
            for (String n : nombres) {
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio026 ejercicio = new Ejercicio026();
        ejercicio.gestorUsuarios();
    }
}