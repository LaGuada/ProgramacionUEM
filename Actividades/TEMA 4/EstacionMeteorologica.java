import java.util.Random;
import java.util.Scanner;

public class EstacionMeteorologica {

    /*
     * En una estación meteorológica se registra la temperatura (en grados
     * centígrados) en cada hora durante el día. Almacenamos el resultado en un
     * array de 24 elementos.
     * 
     * Diseña un programa que muestre por pantalla un menú con las siguientes
     * opciones (en negrita) y que realice las acciones que se describen:
     * 
     * a) Rellenar el vector de forma manual. Esta funcionalidad permite al usuario
     * rellenar manualmente cada uno de los 24 elementos.
     * 
     * b) Rellenar el vector de forma aleatoria. Los 24 elementos del vector se
     * rellenan de forma aleatoria, con valores entre 0 y 40.
     * 
     * c) Mostrar datos. Muestra los datos almacenados en el vector.
     * 
     * d) Obtener máximos y mínimos. Muestra las temperaturas máxima y mínima del
     * día, así como la hora en la que se dan.
     * 
     * e) Temperatura media. Calcula la temperatura media del día.
     * 
     * f) Salir. Sale del programa.
     */

    public static void main(String[] args) {
        int[] temperatura = new int[24];


        char opcion;
        Random temperaturaAleatoria = new Random();
        Scanner teclado = new Scanner(System.in);
        

        boolean repetir= false;

    while (!repetir) {
            
        
        System.out.println("Realice una de las siguientes opciones: ");
        System.out.println("a) Rellenar el vector de forma manual.");
        System.out.println("b) Rellenar el vector de forma aleatoria");
        System.out.println("c) Mostrar datos");
        System.out.println("d) Obtener máximos y mínimos");
        System.out.println("e) Temperatura media.");
        System.out.println("f) Salir");

        opcion = teclado.next().charAt(0);


       switch (opcion) {
            case 'a':
                for (int i = 0; i < temperatura.length; i++) {

                    System.out.println("Introduce la temperatura " + i + ":");
                    temperatura[i] = teclado.nextInt();

                }
                break;


            case 'b':
                for (int i = 0; i < temperatura.length; i++) {
                    temperatura[i] = temperaturaAleatoria.nextInt(40);

                }

                break;

            case 'c':
                System.out.println(
                        "A continuacion se muestran los datos de temepratura recogidos durante el dia de hoy: ");

                for (int i = 0; i < temperatura.length; i++) {

                    System.out.println("A las " + i + ":00 horas " + temperatura[i] + "º grados");

                }

                break;

            case 'd':
                int tempMaxima=0;
                int tempMinima=0;
                int horaMax=0;
                int horaMin=0;

                for (int i=0; i<temperatura.length; i++){

                    if (temperatura[i]>tempMaxima){
                        tempMaxima = temperatura [i];
                        horaMax = i;
                    }

                }

                System.out.println(" La temperatura máxima alcanzada hoy ha sido de " + tempMaxima + " grados Celsius a las + " + horaMax + " :00 horas");

                for (int i=0; i<temperatura.length; i++){

                    if (temperatura[i]<tempMinima){
                        tempMinima = temperatura [i];
                        horaMin = i;
                    }

                }

                System.out.println(" La temperatura mínima alcanzada hoy ha sido de " + tempMinima + " grados Celsius a las + " + horaMin + " :00 horas");

                break;

            case 'e':

                int suma=0;
                for (int i = 0; i<temperatura.length; i++) {
                    suma=temperatura [i] + suma;
                }

                System.out.println("La temperatura media es: " + suma/temperatura.length);

                break;


            case 'f':

                System.out.println("Gracias por acceder al sistema");

                return;

                default: 
                    System.out.println("La opción introducda no está en la lista");

            }
            
        
        }
        
        teclado.close();
    }

    
}
