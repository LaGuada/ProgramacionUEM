public class Ejercicio1 {

    public static void main(String[] args) {

        // Escribir un programa en Java que, dados 2 números con decimales por el
        // usuario, muestre por pantalla la suma, resta, multiplicación, división y
        // módulo de los mismos.

        double decimal1 = 1.1;
        double decimal2 = 2.2;

        double resultadosuma = decimal1 + decimal2;
        double resultadoresta = decimal1 - decimal2;
        double resultadomultiplico = decimal1 * decimal2;
        double resultadodivido = decimal1 / decimal2;
        double resultadoresto = decimal1 % decimal2;

        System.out.println("La suma de mis decimales es " + resultadosuma);
        System.out.println("La resta de mis decimales es " + resultadoresta);
        System.out.println("La multiplicación de mis decimales es " + resultadomultiplico);
        System.out.println("La división de mis decimales es " + resultadodivido);
        System.out.println("El resto de mis decimales es " + resultadoresto);

    }

}