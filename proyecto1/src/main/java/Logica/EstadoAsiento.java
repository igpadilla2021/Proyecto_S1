/**
 * clase que define el estado actual del asiento
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Logica;

/** aplicacion del patron State en funcion del cambio de estado de asientos */
interface EstadoAsiento {
    void reservar(Asiento asiento);
}