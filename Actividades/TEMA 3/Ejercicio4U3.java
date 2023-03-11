import java.util.Scanner;

public class Ejercicio4U3 {
    public static void main(String[] args) {

        /*
         * Dado un número, realiza un programa que indique por pantalla en una frase sus
         * propiedades, las cuales pueden ser:
         * Par o impar. Positivo o negativo. Entero o decimal.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un número y te diré sus propiedades");

        float numeroProp = teclado.nextFloat();

        if (numeroProp % 2 == 0) {

            System.out.print("El numero es par ");

        } else {

            System.out.print("El número es impar");

        }
        if (numeroProp > 0) {

            System.out.print(",  es positivo ");
        } else {

            System.out.print(" , es negativo ");
        }

        if (numeroProp % 1 == 0) {
            System.out.print(" y entero");

        } else {
            System.out.print(" y decimal");

        }

        teclado.close();
    }
}