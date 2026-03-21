package seleccion;

import java.util.Scanner;

public class Ejercicio05 {

    public String comprobarNumero(int n) {
        if (n > 0) {
            return "Positivo";
        } else if (n < 0) {
            return "Negativo";
        } else {
            return "Cero";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Numero: ");
        numero = sc.nextInt();

        Ejercicio05 obj = new Ejercicio05();
        String resultado = obj.comprobarNumero(numero);

        System.out.println(resultado);

        sc.close();
    }
}