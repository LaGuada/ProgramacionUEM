package Ejercicios;

public class TarjetaRegalos {
    // Atributos: 

    double saldo;
    int clave;
    
    
    // Metodos constructores (por defecto)
    private TarjetaRegalos(double saldo) {
        this.saldo = saldo;
    }


    // Otros métodos: we
    public int generaNumAleatorio() {
        int num = (int)Math.floor(Math.random()*(0-(9999+1))+(9999+1));
        return num;
    }

    
    public void gasta(double coste) { 
        if(coste < saldo) {
            System.out.println("Operación aceptada, le quedan " + (saldo-coste) + " euros");
        } else {
            System.out.println("Error, operación denegada, saldo insuficiente.");
        }
    } 

    public TarjetaRegalos fusionaCon(TarjetaRegalos t2) {
       
        TarjetaRegalos fusion = new TarjetaRegalos(this.saldo + t2.saldo);
        fusion.clave =  generaNumAleatorio();
        this.saldo = 0;
        t2.saldo = 0;
        return fusion;
        
    } 

    public double comprobarSaldo() {
       return saldo;
    }

    public static void main(String[] args) {
       TarjetaRegalos t1 = new TarjetaRegalos(100);
       TarjetaRegalos t2 = new TarjetaRegalos(120); 

       t1.gasta(45.90);
       t2.gasta(5);
       t2.gasta(200);
       t1.gasta(3.55);
       System.out.println(t1.comprobarSaldo());
       System.out.println(t2.comprobarSaldo());
       TarjetaRegalos t3 = t1.fusionaCon(t2);
       System.out.println(t1.comprobarSaldo());
       System.out.println(t2.comprobarSaldo());
       System.out.println(t3.comprobarSaldo());
    }
}    
