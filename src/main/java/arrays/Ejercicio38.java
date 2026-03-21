package arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio38 {

    public String comprobarNumero(int intento, int secreto) {

        if (intento < secreto) {
            return "mayor";
        } else if (intento > secreto) {
            return "menor";
        } else {
            return "correcto";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secreto = rand.nextInt(50) + 1;
        int intento;
        String resultado;

        Ejercicio38 obj = new Ejercicio38();

        do {
            System.out.print("Introduce un numero (1-50): ");
            intento = sc.nextInt();

            resultado = obj.comprobarNumero(intento, secreto);

            if (!resultado.equals("correcto")) {
                System.out.println("El numero es " + resultado);
            }

        } while (!resultado.equals("correcto"));

        System.out.println("¡Has acertado!");

        sc.close();
    }
}