package seleccion;

import java.util.Scanner;

public class Ejercicio09 {

    public boolean esBisiesto(int anio) {

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anio;

        System.out.print("Introduce un año: ");
        anio = sc.nextInt();

        Ejercicio09 obj = new Ejercicio09();
        boolean resultado = obj.esBisiesto(anio);

        System.out.println(resultado);

        sc.close();
    }
}