package metodos;

import java.util.Scanner;

public class Ejercicio18 {

    public String crearSaludo(String nombre) {
        return "Hola " + nombre;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;

        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();

        Ejercicio18 obj = new Ejercicio18();
        String saludo = obj.crearSaludo(nombre);

        System.out.println(saludo);

        sc.close();
    }
}