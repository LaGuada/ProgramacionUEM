import java.util.Scanner;

public class MatrizCuatroPorCuatro {
   
public static void main(String[] args) {		
		
	boolean caso = true;
    int opciones = -1;
    int escogido;
    int[][] numerosMatriz = new int[4][4];
    
    int numeroElem = numerosMatriz.length * numerosMatriz[0].length;
    int numColumnas = numerosMatriz[0].length;
    int numFilas = numerosMatriz.length;
    
    int numMet = 0;
 
    double sumar = 0;
    double media;
    
    
    Scanner teclado = new Scanner(System.in);
    
    while(caso) {
        
        System.out.println();
        
        System.out.println("Elige una de estas opciones:\n\n" + 
                "1.- Rellenar una matriz 4x4 de números.\n" +
                "2.- Sumar una de las filas de la matriz.\n" +
                "3.- Sumar una columna de la matriz.\n" +
                "4.- Sumar la diagonal principal de la matriz.\n" +
                "5.- Sumar la diagonal inversa de la matriz.\n" + 
                "6.- Ver la media de todos los valores de la matriz.\n" +
                "7.- Terminar programa.");		
        
        System.out.println();		
        
        opciones = teclado.nextInt();
                    
        if(numMet >= numeroElem || opciones == 1) { 
            switch(opciones){
            
            case 1:	
                        
                for(int i = 0; i < numerosMatriz.length; i++) {
                    for(int j = 0; j < numerosMatriz[0].length; j++) {
                        System.out.println("Rellena la matriz");
                        numerosMatriz[i][j] = teclado.nextInt();
                        numMet++;
                    }
                }
                //Presento la matriz solo por verla		
                for(int i = 0; i < numerosMatriz.length; i++) {
                    System.out.println();
                    for(int j = 0; j < numerosMatriz[0].length; j++) {
                        System.out.print(numerosMatriz[i][j] + " ");
                    }
                }
                        
                System.out.println();
                
                break;	
                
            case 2:
                            
                System.out.println("Elige entre la 1ª y 4ª fila para sumarla");
                escogido = teclado.nextInt();
                            
                if (escogido >= 1 && escogido <= numFilas) {
                                
                    for(int i = 0; i < numerosMatriz[0].length; i++) {
                        sumar += numerosMatriz[escogido - 1][i];
                }

                System.out.println();
                System.out.println("La suma de la fila " + escogido + " es: " + sumar + "\n");
                sumar = 0;
                }
                
                else {
                    System.out.println("Eliga una de las " + numFilas + " correcta");						
                }
                
                break;	
                
            case 3:
                        
                System.out.println("Eliga una columna para sumarla ");
                escogido = teclado.nextInt();
                
                if(escogido >= 1 && escogido <= numColumnas) {
                    for(int i = 0; i < numerosMatriz.length; i++) {
                        sumar += numerosMatriz[i][escogido-1];
                    }
                    
                System.out.print("La columna " + escogido + " suma: " + sumar + "\n");
                sumar = 0;
                }
                else {
                    System.out.println("Eliga una de las " + numColumnas + "correcta");
                }
                
                break;	
                
            case 4:
                        
                System.out.println("Vamos a sumar la diagonal principal de la matriz");
                        
                for(int i = 0; i < numerosMatriz.length; i++) {								
                    sumar += numerosMatriz[i][i];
                }
                        
                System.out.print("La suma de la diagonal de la matriz: " + sumar);
                System.out.println();
                sumar = 0;			
                
                break;
                
            case 5:						
                        
                System.out.println("Vamos a sumar la diagonal inversa de la matriz");
                        
                for(int i = 0; i < numerosMatriz.length; i++) {
                            
                    sumar += numerosMatriz[i][(numerosMatriz.length -1) - i];
                }
                        
                System.out.print("La suma de la diagonal inversa de la matriz: " + sumar);
                System.out.println();
                sumar = 0;
                
                break;
                
            case 6: 
                    
                for (int i = 0; i < numerosMatriz.length; i ++) {
                    for( int j = 0; j < numerosMatriz[0].length; j++) {
                                
                        sumar += numerosMatriz[i][j]; 
                    }
                }

                media = sumar/numeroElem;
                System.out.println("Suma Elementos: "+ sumar);
                System.out.println("Cantidad Elementos: "+ numeroElem);
                System.out.println("La media es: "+ media);
                sumar = 0;
                
                break;	
                
            case 7:
                caso = false;
                
                break;
                
            default:						
                System.out.println("Ha ocurrido un error");
            }				
        }			
        else {
            
            System.out.println("Debes completar una matriz en la opción 1 \n");				
        }
    }					
    System.out.println("FIN");
    teclado.close();
}

}