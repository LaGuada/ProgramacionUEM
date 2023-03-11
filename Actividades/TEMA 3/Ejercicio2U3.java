public class Ejercicio2U3 {

    public static void main(String[] args) {

        /*
         * Escribir por pantalla los números incrementando desde 1 hasta que la suma de
         * todos esos números sea mayor a una variable entera x
         */

        int numero = 100;
        int numerosuma = 1;

        do {

            System.out.println(numerosuma);

            numerosuma++;

        } while (numerosuma + numerosuma <= numero);

    }
}
