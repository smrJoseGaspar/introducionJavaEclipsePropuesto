package ejercicios;

import java.util.Scanner;

public class Ejercicio029 {

    //COMPLETAR METODO
    public void secuenciaFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce cuántos términos quieres: ");
        int n = scanner.nextInt();

        System.out.println("Secuencia Fibonacci (" + n + " términos):");

        int primero = 0;
        int segundo = 1;
        String resultado = "";

        for (int i = 0; i < n; i++) {
            resultado = resultado + primero + " ";
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }

        System.out.println(resultado);

        scanner.close();
    }

    public static void main(String[] args) {
        Ejercicio029 ejercicio = new Ejercicio029();
        ejercicio.secuenciaFibonacci();
    }
}