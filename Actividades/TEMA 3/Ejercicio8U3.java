import java.util.Scanner;

public class Ejercicio8U3 {
    public static void main(String[] args) {

        /*
         * Escribir un programa en Java que calcule si un determinado número que se pasa
         * por teclado es primo
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un número y te voy a calcular si es primo ");

        int numeroPrimo;

        numeroPrimo = teclado.nextInt();
        int suma = 0;

        for (int i = 1; i <= numeroPrimo; i++) {
            int restoi = numeroPrimo % i;

            if (restoi == 0) {
                suma = suma + 1;
            }

        }

        if (suma <= 2) {

            System.out.println("Tu número es primo");

        } else {

            System.out.println("Tu número no es primo ");

        }

        teclado.close();

    }
}
