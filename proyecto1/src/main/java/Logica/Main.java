package Logica;

public class Main {
    public static void main(String[] args) {
        Estacion e1 = Estacion.getInstance();
        Asiento a1;

        e1.reservarAsiento(Estacion.SALON_CAMA, 1, 8);

        a1 = e1.getAsiento(Estacion.SALON_CAMA, 1, 8);
        System.out.println(a1.getNumero());
        System.out.println(a1.getEstado());

        a1 = e1.getAsiento(Estacion.SALON_CAMA, 1, 9);
        System.out.println(a1.getNumero());
        System.out.println(a1.getEstado());
    }
}
