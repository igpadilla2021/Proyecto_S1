/**
 * clase que define el boton para seleccionar los asientos
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Grafic.Botones;

import Grafic.PanelVentanas;
import Grafic.SeleccionAsientos;
import Logica.Bus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonReservar extends JButton {
    private SeleccionAsientos seleccionAsientos;
    private PanelVentanas panelVentanas;
    private Bus bus;

    /**
     * metodo constructor que se encarga de generar el boton para reservar los asientos en el bus seleccionado
     * @param seleccionAsientos son los asientos seleccionados
     * @param bus es el bus
     * @param panelVentanas es el panel de la ventana
     * @param text string de texto
     */
    public BotonReservar(SeleccionAsientos seleccionAsientos,Bus bus, PanelVentanas panelVentanas, String text){
        super(text);
        this.bus=bus;
        this.panelVentanas=panelVentanas;
        this.seleccionAsientos=seleccionAsientos;
        this.addActionListener(new EscuchadorBotton());
    }

    /**
     * metodo constructor que genera el escuchador del boton para reservar asientos
     */
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            int[] reservados=seleccionAsientos.getReservados();
            for (int c=0; c<42; c=c+1){
                if (reservados[c]!=0){
                    bus.reservar(c+1);
                }
            }
            panelVentanas.retrocesoVentana(3);
        }
    }
}

