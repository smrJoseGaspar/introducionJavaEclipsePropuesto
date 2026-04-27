package com.elizabeth;
import java.util.Scanner;

public class Ejercicio18 {

    // 🔹 MÉTODO
    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre + ", bienvenido/a");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        // 🔹 LLAMADA AL MÉTODO
        saludar(nombre);

        sc.close();
	}

}
