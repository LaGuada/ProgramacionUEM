import java.util.Scanner;

public class Ejercicio3U3 {
    public static void main(String[] args) {

        // Dados un dividendo y un divisor, indique por pantalla si la división de ambos
        // es exacta

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un dividendo ");

        int dividendo = teclado.nextInt();

        System.out.println("Dame un divisor ");

        int divisor = teclado.nextInt();

        int division = (dividendo % divisor);

        if (division == 0) {

            System.out.println("La división es exacta");

        } else {

            System.out.println("La división es inexacta");
        }

        teclado.close();

    }
}
