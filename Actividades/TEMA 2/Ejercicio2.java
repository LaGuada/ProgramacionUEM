public class Ejercicio2 {
    public static void main(String[] args) {

        // Definir el programa en Java necesario para intercambiar los valores de dos
        // variables numéricas.

        int variable1 = 5;
        int variable2 = 8;

        System.out.println("Los valores inciales de mis variables son " + variable1 + " y " + variable2);

        variable1 = variable1 + variable2;
        variable2 = variable1 - variable2;
        variable1 = variable1 - variable2;

        System.out.println("Los valores finales de mis variables son " + variable1 + " y " + variable2);

    }
}
