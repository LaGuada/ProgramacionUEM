import java.util.Scanner;
/* Crear una función de forma recursiva que cuente los dígitos que tiene un número entero que se pide al usuario por teclado. */


public class Digitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        System.out.println(medirNumero(numero));

        teclado.close();
    }

    public static int medirNumero (int numero){
            int contador = 1;
            if (numero < 10 ){
                return contador; 
            }
            else {
                return medirNumero(numero/10) + contador++;
            }



        }
    }

