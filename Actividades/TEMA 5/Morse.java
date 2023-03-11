import java.util.Scanner;

public class Morse {

/* Crea una función con la siguiente cabecera: 

public static String convierteEnMorse(int n) 

Esta función convierte el número n al sistema Morse y lo devuelve en una cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en Morse. Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe mostrar nada por pantalla, solo se debe usar print desde el programa principal.  */

    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Dime un número para convertirlo en Morse:");
    int numero = teclado.nextInt();

    System.out.println(convierteEnMorse(numero));

    teclado.close();

    }

    public static String convierteEnMorse(int n) { 
        String morse []= 
            {
                "_ _ _ _ _" , 
                ". _ _ _ _" , 
                ". . _ _ _ ", 
                "... __ ", 
                ".... _ ", 
                ".....", 
                "_ . . . . ", 
                "_ _ . . . ",  
                "_ _ _ . .  ", 
                "_ _ _ _ ."
            };

        String numeroString = String.valueOf(n);
        String morseString = "";

        for (int i = 0; i < numeroString.length(); i++){
            morseString+= morse[Integer.parseInt(numeroString.substring(i, i+1))];
        }   

        return morseString;

    }

}
    

