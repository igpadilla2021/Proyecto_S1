package Logica;

public class AsientoDisponible implements EstadoAsiento {
    @Override
    public void reservar(Asiento asiento) {
        asiento.setEstado(new AsientoOcupado());
    }
}