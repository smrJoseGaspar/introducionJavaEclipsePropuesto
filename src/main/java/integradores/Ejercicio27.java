package integradores;

import java.util.Scanner;

public class Ejercicio27 {

    public String convertirABinario(int numero) {

        if (numero == 0) {
            return "0";
        }

        String binario = "";

        while (numero > 0) {
            int resto = numero % 2;
            binario = resto + binario;
            numero = numero / 2;
        }

        return binario;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Introduce un numero decimal: ");
        numero = sc.nextInt();

        Ejercicio27 obj = new Ejercicio27();
        String resultado = obj.convertirABinario(numero);

        System.out.println("Binario: " + resultado);

        sc.close();
    }
}