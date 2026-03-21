package bucles;

import java.util.Scanner;

public class Ejercicio10 {

    public int obtenerMayor(int a, int b, int c) {

        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }

        if (c > mayor) {
            mayor = c;
        }

        return mayor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Primer numero: ");
        a = sc.nextInt();

        System.out.print("Segundo numero: ");
        b = sc.nextInt();

        System.out.print("Tercer numero: ");
        c = sc.nextInt();

        Ejercicio10 obj = new Ejercicio10();
        int resultado = obj.obtenerMayor(a, b, c);

        System.out.println("El mayor es: " + resultado);

        sc.close();
    }
}