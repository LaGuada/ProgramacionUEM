public class Ejercicio4 {
    public static void main(String[] args) {

        // Diseñar un programa en Java que convierta una cantidad positiva de segundos,
        // a su equivalente en horas, minutos y segundos

        int segundosiniciales = 23000, hora, minutos, segundos;

        minutos = segundosiniciales / 60;
        segundos = segundosiniciales % 60;
        hora = minutos / 60;
        minutos = minutos % 60;

        System.out.println("La hora final sería " + hora + " horas " + minutos + " minutos " + segundos + " segundos");

    }
}
