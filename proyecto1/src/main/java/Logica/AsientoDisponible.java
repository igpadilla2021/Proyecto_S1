/**
 * clase que define a los asientos disponibles
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Logica;

public class AsientoDisponible implements EstadoAsiento {
    /**
     * metodo para reservar un asiento
     * @param asiento es el asiento que se va a reservar
     */
    @Override
    public void reservar(Asiento asiento) {
        asiento.setEstado(new AsientoOcupado());
    }
}