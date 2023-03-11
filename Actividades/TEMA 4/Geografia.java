import java.util.Scanner;

public class Geografia {
    
    /* Crea un programa que pida por pantalla cuatro provincias españolas y a continuación tres ciudades de cada una de ellas. Los nombres de ciudades deben almacenarse en un array multidimensional cuyo primer índice sea el número asignado a cada provincia y el segundo índice el número asignado a cada ciudad. */

   public static void main(String[] args) {
    
    String [] provincias = new String [4];
    String [][] ciudades = new String [4][3];

    Scanner teclado = new Scanner (System.in);

    System.out.println("Introduce el nombre de cuatro provincias españolas");


    for (int i =0; i<provincias.length; i++) {
        provincias [i] = teclado.nextLine();
    }

    for (int i=0; i<provincias.length; i++){
        System.out.println("Introduce tres ciudades de " + provincias[i]);

        for (int j=0; j<3; j++){
            ciudades [i][j]= teclado.nextLine();
        }
    }
    
for (int i=0; i<provincias.length; i++){
    System.out.print("\n" + "Provincia: " + provincias[i] + "\t");

    for (int j=0; j<1; j++) {
        System.out.print ("Ciudades: " + ciudades[i][j] + ",");
        System.out.print (ciudades [i][j+1] + ",");
        System.out.print (ciudades [i][j+2] + ",");

    }
}


teclado.close();

   } 


}
