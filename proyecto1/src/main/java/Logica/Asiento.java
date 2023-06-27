/**
 * clase que define a los asientos
 * @author Ignacio padilla
 * @author Joaquin garcia
 */
package Logica;

public class Asiento {
    private int num;
    private EstadoAsiento estado;

    /**
     * metodo constructor para la clase asiento. se encarga de generar un asiento con su respectivo numero
     * @param num es el numero del asiento
     */
    public Asiento(int num) {
        this.num = num;
        estado = new AsientoDisponible();
    }

    /**
     * metodo para saber el estado del asiento
     * @return retorna el estado del asiento (disponible u ocupado)
     */
    public boolean getEstado() {
        return estado instanceof AsientoOcupado;
    }

    /**
     * metodo para reservar un asiento
     */
    public void reservarAsiento() {
        estado.reservar(this);
    }

    /**
     * metodo para saber el numero del asiento
     * @return retorna el numero del asiento
     */
    public int getNumero() {
        return num;
    }

    /**
     * metodo para establecer el estado de un asiento
     * @param estado es el estado del asiento
     */
    public void setEstado(EstadoAsiento estado) {
        this.estado = estado;
    }
}