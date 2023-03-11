public class Ejercicio3 {

    public static void main(String[] args) {

        // Implementar un programa en Java que dado un número entero de 5 dígitos, lo
        // escriba al revés

        int numeroreverso = 28127, C1, C2, C3, C4, C5;
        String c1, c2, c3, c4, c5;

        C5 = numeroreverso % 10;
        C4 = numeroreverso % 100 / 10;
        C3 = numeroreverso % 1000 / 100;
        C2 = numeroreverso % 10000 / 1000;
        C1 = numeroreverso % 100000 / 10000;

        c1 = String.valueOf(C1);
        c2 = String.valueOf(C2);
        c3 = String.valueOf(C3);
        c4 = String.valueOf(C4);
        c5 = String.valueOf(C5);

        System.out.println("El número original era " + numeroreverso + " y el final es " + c5 + c4 + c3 + c2 + c1);
    }

}
