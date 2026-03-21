package secuencia;

import java.util.Scanner;

public class Ejercicio04 {

    public double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base;
        double altura;

        System.out.print("Base: ");
        base = sc.nextDouble();

        System.out.print("Altura: ");
        altura = sc.nextDouble();

        Ejercicio04 obj = new Ejercicio04();
        double area = obj.calcularArea(base, altura);

        System.out.println("Area del triangulo: " + area);

        sc.close();
    }
}