package seleccion;

import java.util.Scanner;

public class Ejercicio08 {

    public String obtenerDia(int numero) {

        switch (numero) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miercoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sabado";
            case 7:
                return "Domingo";
            default:
                return "Numero no valido";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Introduce un numero (1-7): ");
        numero = sc.nextInt();

        Ejercicio08 obj = new Ejercicio08();
        String dia = obj.obtenerDia(numero);

        System.out.println(dia);

        sc.close();
    }
}