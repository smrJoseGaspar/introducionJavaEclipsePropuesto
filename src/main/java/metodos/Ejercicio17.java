package metodos;

import java.util.Scanner;

public class Ejercicio17 {

    public int obtenerMayor(int a, int b) {

        int mayor;

        if (a > b) {
            mayor = a;
        } else {
            mayor = b;
        }

        return mayor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Primer numero: ");
        num1 = sc.nextInt();

        System.out.print("Segundo numero: ");
        num2 = sc.nextInt();

        Ejercicio17 obj = new Ejercicio17();
        int resultado = obj.obtenerMayor(num1, num2);

        System.out.println("El mayor es: " + resultado);

        sc.close();
    }
}