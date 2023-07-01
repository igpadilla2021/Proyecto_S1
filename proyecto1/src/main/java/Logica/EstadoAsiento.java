/**
 * clase que define el estado actual del asiento
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Logica;

/**
 * interfas utilizada para la aplicacion del patron state
 * define una funcion asosiada a la reserva de asientos
 */
interface EstadoAsiento {
    void reservar(Asiento asiento);
}