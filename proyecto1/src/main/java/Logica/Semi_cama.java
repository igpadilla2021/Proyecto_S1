/**
 * clase que define los asientos de tipo semi cama
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Logica;

import Logica.Bus;

import java.util.List;

public class Semi_cama extends Bus {
    private static final int NUM_ASIENTOS = 30;

    /**
     * metodo constructor de el tipo de asiento semi cama con una cantidad de asientos = 30
     */
    public Semi_cama() {
        super(NUM_ASIENTOS);
    }
}

