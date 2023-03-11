// La empresa El Corte Islandés nos ha encargado una aplicación para gestionar las tarjetas regalo. Como primer paso para implementar la aplicación, es necesario crear la clase principal. Implementa la clase TarjetaRegalo. Cuando se crea una nueva tarjeta, se le da un saldo y se asigna de forma automática un número de 5 dígitos. Si se intenta gastar más dinero del que tiene la tarjeta, se debe mostrar un mensaje de error. Dos tarjetas regalo se pueden fusionar creando una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo número aleatorio de 5 cifras. Al fusionar dos tarjetas en una, las dos tarjetas originales se quedarían con 0 € de saldo.

// Programa principal:

// TarjetaRegalo t1 = new TarjetaRegalo(100); 

// TarjetaRegalo t2 = new TarjetaRegalo(120); 

// t1.gasta(45.90);
// t2.gasta(5);
// t2.gasta(200);
// t1.gasta(3.55);
// System.out.println(t1.comprobarSaldo());
// System.out.println(t2.comprobarSaldo());
// TarjetaRegalo t3 = t1.fusionaCon(t2);
// System.out.println(t1.comprobarSaldo());
// System.out.println(t2.comprobarSaldo());
// System.out.println(t3.comprobarSaldo());
// Salida:

// No tiene suficiente saldo para gastar 200,00€
// 50.550000000000004
// 115.0
// 0.0
// 0.0
// 165.55


package Tarjeta;

public class TarjetaRegalo {
    private double saldo;
    private String id;
    private static int contador = 1;

    // Constructor
    //  - Da valor a saldo, utiliza una fórmula (con math round) para dejarlo con solo 2 decimales
    //  - Crea la id del objeto, usando la función crearId que está debajo
    //  - Aumenta +1 a la variable static contador, la cual utilizo para dar las id (dándoles cada vez un valor +1)
    public TarjetaRegalo(double saldo) {
        this.saldo = Math.round(saldo*100)/100;
        this.id = crearId();
        contador ++;
    }

    // Función para crear ids para los objetos
    //  - Primero coge la propiedad static contador (que en el propio constructor se le va sumando +1 cada vez que se crea un objeto)
    //  - Convierte contador a string
    //  - Lo pasa por un bucle while si tiene menos de 5 cifras, y le añade ceros a la izquierda.
    public String crearId() {
        Integer numeroIdEnvoltorio = contador;
        String numeroId = numeroIdEnvoltorio.toString();
        while (numeroId.length() < 5) {
            numeroId = "0" + numeroId;
        }
        return numeroId;
    }

    // Método para fusionar
    //  - Coge a la tarjeta que llama al método y otra tarjeta que selecciona como parámetro
    //  - Crea una tercera tarjeta y le da el saldo de esas dos tarjetas (y lo redondea con 2 decimales usando Math.round(x)*100/100
    //  - Les quita el saldo a las 2 tarjetas que ha cogido
    //  - Finalmente devuelve la tarjeta fusionada
    public TarjetaRegalo fusionaCon(TarjetaRegalo Tarjeta2) {
        double saldo3 = this.saldo + Tarjeta2.saldo;
        saldo3 = Math.round(saldo3*100)/100;
        TarjetaRegalo TarjetaFusionada = new TarjetaRegalo(saldo3);
        this.saldo = 0;
        Tarjeta2.saldo = 0;
        return TarjetaFusionada;
    }

    // Método para gastar
    //  - Coge como parámetro el precio de la compra
    //  - Si el precio de la compra es superior al de la tarjeta, imprime un mensaje diciendo que no se puede realizar la compra
    //  - Si el precio de la compra es inferior o igual al de la tarjeta, le resta el precio de la compra al saldo y luego lo redondea con 2 decimales
    public void gasta(double precioCompra){
        if (precioCompra > this.saldo) {
            System.out.println("No tiene suficiente saldo para gastar " + precioCompra + " euros.");
        }
        else {
            this.saldo = this.saldo - precioCompra;
            this.saldo = Math.round(this.saldo*100)/100;
        }
    }

    // Método para comprobar saldo
    public String comprobarSaldo() {
        return "El saldo de la tarjeta con ID " + this.id + " es: " + this.saldo;
    }
}
