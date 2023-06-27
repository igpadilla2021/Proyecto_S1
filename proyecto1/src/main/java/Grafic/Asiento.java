/**
 * clase que define el boton para los asientos
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Grafic;

import Logica.Bus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Asiento  extends JButton {
    private int numAsiento;
    private Bus bus;
    private SeleccionAsientos seleccionAsientos;
    private boolean estado=false;

    /**
     * metodo constructor de Asiento que se encarga de generar y asignar un numero a los asientos para cada bus, junto
     * con un escuchador para poder seleccionar el asiento deseado
     * @param numAsiento es el numero del asiento
     * @param bus es el bus
     * @param seleccionAsientos es la clase que se encarga de la seleccion de asientos
     */
    public Asiento(int numAsiento, Bus bus, SeleccionAsientos seleccionAsientos){
        super(Integer.toString(numAsiento));
        this.seleccionAsientos=seleccionAsientos;
        this.bus=bus;
        this.numAsiento=numAsiento;
        this.addActionListener(new EscuchadorBotton());
    }

    /**
     * metodo que se encarga de escuchar la accion de seleccionar los asientos, asiento que su estado sea seleccionado
     * o no seleccionado
     */
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (estado==false && bus.getAsiento(numAsiento).getEstado()==false){
                seleccionAsientos.seleccionar(numAsiento);
                estado=true;
            }
            else if (estado==true && bus.getAsiento(numAsiento).getEstado()==false){
                seleccionAsientos.desselccionar(numAsiento);
                estado=false;
            }
            seleccionAsientos.repaint();
        }
    }

    /**
     * metodo que bloquea la seleccion de asientos
     */
    public void bloquear(){
        this.setEnabled(false);
    }
}
