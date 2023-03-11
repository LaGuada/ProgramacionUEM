public class Ejercicio1U3 {

    public static void main(String[] args) {

        /* 1. Escribir por pantalla los números del 1 al 100 que sean impares. */

        // la forma de saber que el número es impar es que el resto sea distinto de cero

        int numeroImpar;

        for (numeroImpar = 0; numeroImpar <= 100; numeroImpar++) {

            if (numeroImpar % 2 != 0) {

                System.out.println(numeroImpar);

            }

        }

    }

}
