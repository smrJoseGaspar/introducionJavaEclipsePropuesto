package metodos;

import java.util.Scanner;

public class Ejercicio16 {

    public boolean comprobarPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();

        Ejercicio16 obj = new Ejercicio16();
        boolean resultado = obj.comprobarPar(numero);

        System.out.println(resultado);

        sc.close();
    }
}