package Logica;
import Logica.Buses.Salon_cama;

public class Main {
    public static void main(String[] args) {
        Bus b1=new Salon_cama();
        b1.reservar(1);
        System.out.println(b1.getEstado(1));
        System.out.println(b1.getNumero(1));
    }
}
