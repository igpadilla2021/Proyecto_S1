package Logica;

public class Main {
    public static void main(String[] args) {
        Estacion e1= new Estacion();
        e1.reservarAsiento(Estacion.SALON_CAMA,1,8);
        Asiento a1;

        a1=e1.getAsiento(Estacion.SALON_CAMA,1,8);
        System.out.println(a1.getNumero());
        System.out.println(a1.getEstado());

        a1=e1.getAsiento(Estacion.SALON_CAMA,1,9);
        System.out.println(a1.getNumero());
        System.out.println(a1.getEstado());
    }
}
