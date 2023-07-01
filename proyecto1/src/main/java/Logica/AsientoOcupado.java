/**
 * clase que define a los asientos ocupados
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Logica;

public class AsientoOcupado implements EstadoAsiento {
    /**
     * metodo para intentar reservar un asiento ocupado
     * @param asiento es el asiento ya ocupado
     */
    @Override
    public void reservar(Asiento asiento) {
        System.out.println("El asiento " + asiento.getNumero() + " ya está ocupado.");
    }
}
