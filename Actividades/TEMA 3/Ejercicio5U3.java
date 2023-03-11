import java.util.Scanner;

public class Ejercicio5U3 {

    public static void main(String[] args) {

        /*
         * Escribir un programa en Java en el que pida al usuario la inserción de
         * números hasta que inserte un 0. Una vez terminado, mostrar en orden los
         * números insertados por el usuario.
         */

        int numeroInsertado;

        Scanner teclado = new Scanner(System.in);

        String conjuntoNumeros = "";

        do {

            System.out.println("Inserta un número entero ");
            numeroInsertado = teclado.nextInt();

            conjuntoNumeros = conjuntoNumeros + " " + numeroInsertado;

        } while (numeroInsertado != 0);

        if (numeroInsertado == 0) {

            System.out.println("Ya no hace falta introducir más");

        }

        teclado.close();

        System.out.println(conjuntoNumeros);
    }
}