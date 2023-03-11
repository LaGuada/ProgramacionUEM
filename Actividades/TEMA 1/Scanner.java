import java.util.Scanner;

public class Scanner {

public static void main(String[] args) {

    // Declaración de variables

    int numeroEntero1, numeroEntero2;

    Scanner teclado = new Scanner (System.in);

    // Leer el primer número

    System.out.println ("Introduce un numero entero: ");

    numeroEntero1 = teclado.nextInt ();

    // Leer el segundo número

    System.out.println ("Introduce un otro número entero: ");

    numeroEntero2 = teclado.nextInt ();

    // Mostrar resultado

    System.out.println ("Los números son: "  +  numeroEntero1 + " y "  + numeroEntero2);

    
}

}