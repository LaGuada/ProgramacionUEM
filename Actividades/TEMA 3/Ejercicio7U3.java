import java.util.Scanner;

public class Ejercicio7U3 {

    public static void main(String[] args) {

        /*
         * Escribir un programa en Java que dado por teclado un número, escriba lo
         * siguiente:
         * 
         * a. “A” si su módulo con 5 es 0
         * 
         * b. “B” si su módulo con 5 es 1
         * 
         * c. “C” si su módulo con 5 es 2
         * 
         * d. “D” si su módulo con 5 es 3
         * 
         * e. “E” si su módulo con 5 es 4
         * 
         * f. “F” en otro caso
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un número ");

        int numeroModulo;

        numeroModulo = teclado.nextInt();

        if (numeroModulo % 5 == 0)

            System.out.println("A");

        else if (numeroModulo % 5 == 1)

            System.out.println("B");

        else if (numeroModulo % 5 == 2)

            System.out.println("C");

        else if (numeroModulo % 5 == 3)

            System.out.println("D");

        else if (numeroModulo % 5 == 4)

            System.out.println("E");

        else

            System.out.println("F");

        teclado.close();

    }
}