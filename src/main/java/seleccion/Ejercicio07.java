package seleccion;

import java.util.Scanner;

public class Ejercicio07 {

    public String clasificarNota(int nota) {

        if (nota >= 0 && nota <= 4) {
            return "Insuficiente";
        } else if (nota == 5) {
            return "Suficiente";
        } else if (nota == 6) {
            return "Bien";
        } else if (nota == 7 || nota == 8) {
            return "Notable";
        } else if (nota == 9 || nota == 10) {
            return "Sobresaliente";
        } else {
            return "Nota no valida";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.print("Introduce la nota: ");
        nota = sc.nextInt();

        Ejercicio07 obj = new Ejercicio07();
        String resultado = obj.clasificarNota(nota);

        System.out.println(resultado);

        sc.close();
    }
}