package seleccion;

import java.util.Scanner;

public class Ejercicio06 {

    public String esParOImpar(int numero) {
        if (numero % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Numero: ");
        numero = sc.nextInt();

        Ejercicio06 obj = new Ejercicio06();
        String resultado = obj.esParOImpar(numero);

        System.out.println(resultado);

        sc.close();
    }
}