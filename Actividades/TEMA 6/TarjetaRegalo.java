public class TarjetaRegalo {

    /* La empresa El Corte Islandés nos ha encargado una aplicación para gestionar las tarjetas regalo. Como primer paso para implementar la aplicación, es necesario crear la clase principal. Implementa la clase TarjetaRegalo. Cuando se crea una nueva tarjeta, se le da un saldo y se asigna de forma automática un número de 5 dígitos. Si se intenta gastar más dinero del que tiene la tarjeta, se debe mostrar un mensaje de error. Dos tarjetas regalo se pueden fusionar creando una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo número aleatorio de 5 cifras. Al fusionar dos tarjetas en una, las dos tarjetas originales se quedarían con 0 € de saldo.*/


    // Atributos

    String numeroTarjeta; // para el aleatorio de 5 cifras
    double saldo, gasto, nuevoSaldo;    
    
    // Método constructor

    public TarjetaRegalo(double saldo) { 
        this.saldo = saldo;

    // Número aleatorio de tarjeta de 5 cifras
    this.numeroTarjeta = "";
    for (int i = 0; i < 5; i++) {
        this.numeroTarjeta += (int)(Math.random() * 10);
       }
    }

    // Métodos

    public void gasta (double gasto){
        if (gasto > saldo){
            System.out.println( "No tiene sufiente saldo para gastar " + gasto);
        } else {
            saldo = saldo -gasto;
        }
    }
    
   public double comprobarSaldo(){
    return saldo;
   }

    public void setSaldo (double saldo){
        this.saldo = saldo;
    }

    public double getSaldo (){
        return saldo;
    }

    public TarjetaRegalo fusionaCon (TarjetaRegalo t){
        double nuevoSaldo = this.getSaldo() + t.getSaldo();
        this.setSaldo(0);
        t.setSaldo(0);
        return new TarjetaRegalo(nuevoSaldo);
        }
    
public static void main(String[] args) {

TarjetaRegalo t1 = new TarjetaRegalo(100); 

TarjetaRegalo t2 = new TarjetaRegalo(120); 

t1.gasta(45.90);
t2.gasta(5);
t2.gasta(200);
t1.gasta(3.55);
System.out.println(t1.comprobarSaldo());
System.out.println(t2.comprobarSaldo());
TarjetaRegalo t3 = t1.fusionaCon(t2);
System.out.println(t1.comprobarSaldo());
System.out.println(t2.comprobarSaldo());
System.out.println(t3.comprobarSaldo());
    
}

    
}