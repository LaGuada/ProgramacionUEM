import java.util.Scanner;

public class Ejercicio6U3 {

    public static void main(String[] args) {

        /*
         * Escribir un programa en Java que dado un número por teclado, escriba “El
         * número es válido” si:
         * 
         * a. El número se encuentra entre 1000 y 10000
         * 
         * b. El número no es divisible por 5 ni termina en 0
         * 
         * En caso contrario, el texto debe ser “El número NO es válido”.
         */

        double numeroValido;

        System.out.println("Introduzca un número  ");

        Scanner teclado = new Scanner(System.in);
        numeroValido = teclado.nextDouble();

        if ((numeroValido < 10000 && numeroValido > 1000) && (numeroValido % 10 != 0) && (numeroValido % 5 != 0)) {

            System.out.println("El número es válido ");

        } else {

            System.out.println("El número NO es válido ");

        }

        teclado.close();

    }

}
