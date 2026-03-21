package bucles;

public class Ejercicio13 {

    public int[] obtenerPares() {
        int[] pares = new int[20];
        int valor = 2;

        for (int i = 0; i < pares.length; i++) {
            pares[i] = valor;
            valor = valor + 2;
        }

        return pares;
    }

    public static void main(String[] args) {
        Ejercicio13 obj = new Ejercicio13();
        int[] resultado = obj.obtenerPares();

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}