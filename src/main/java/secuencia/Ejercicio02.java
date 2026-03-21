package secuencia;

import java.util.Scanner;

public class Ejercicio02 {

    // MÉTODO PARA TEST
    public String construirMensaje(String nombre, int edad) {
        String texto = "Hola " + nombre + ", tienes " + edad + " años.";
        return texto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad;

        System.out.print("Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Edad: ");
        edad = sc.nextInt();

        // CREAS OBJETO PARA USAR EL MÉTODO
        Ejercicio02 obj = new Ejercicio02();
        String resultado = obj.construirMensaje(nombre, edad);

        System.out.println(resultado);

        sc.close();
    }
}