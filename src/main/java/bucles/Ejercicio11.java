package bucles;

import java.util.Scanner;

public class Ejercicio11 {

    public String generarTabla(int numero) {
        String resultado = "";

        for (int i = 1; i <= 10; i++) {
            resultado = resultado + numero + " x " + i + " = " + (numero * i);

            if (i < 10) {
                resultado = resultado + "\n";
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Numero: ");
        numero = sc.nextInt();

        Ejercicio11 obj = new Ejercicio11();
        String tabla = obj.generarTabla(numero);

        System.out.println(tabla);

        sc.close();
    }
}