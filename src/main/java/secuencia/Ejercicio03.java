package secuencia;

import java.util.Scanner;

public class Ejercicio03 {

    public double convertirAFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius;

        System.out.print("Celsius: ");
        celsius = sc.nextDouble();

        Ejercicio03 obj = new Ejercicio03();
        double fahrenheit = obj.convertirAFahrenheit(celsius);

        System.out.println("Fahrenheit: " + fahrenheit);

        sc.close();
    }
}