package Logica;

/** aplicacion del patron State en funcion del cambio de estado de asientos */
interface EstadoAsiento {
    void reservar(Asiento asiento);
}