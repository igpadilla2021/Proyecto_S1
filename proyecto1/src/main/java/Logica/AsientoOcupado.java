package Logica;

public class AsientoOcupado implements EstadoAsiento {
    @Override
    public void reservar(Asiento asiento) {
        System.out.println("El asiento " + asiento.getNumero() + " ya está ocupado.");
    }
}
