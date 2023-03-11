package Tarjeta;

public class Uso_tarjeta {
    public static void main(String args[]) {
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


