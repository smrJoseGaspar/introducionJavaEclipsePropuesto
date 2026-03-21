package metodos;

import java.util.Scanner;

public class Ejercicio19 {

    public int calcularPotencia(int base, int exponente) {

        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado = resultado * base;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base, exponente;

        System.out.print("Base: ");
        base = sc.nextInt();

        System.out.print("Exponente: ");
        exponente = sc.nextInt();

        Ejercicio19 obj = new Ejercicio19();
        int resultado = obj.calcularPotencia(base, exponente);

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}