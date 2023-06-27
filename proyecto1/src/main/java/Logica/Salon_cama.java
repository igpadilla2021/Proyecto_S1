/**
 * clase que define los asientos de tipo salon cama
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Logica;

import java.util.Random;

public class Salon_cama extends Bus {
    private static final int NUM_ASIENTOS = 42;

    /**
     * metodo constructor de el tipo de asiento salon cama con un numero de asientos = 42
     */
    public Salon_cama() {
        super(NUM_ASIENTOS);
    }
}