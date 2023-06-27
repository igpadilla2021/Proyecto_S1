/**
 * clase que define el boton para pasar de la ventana 1
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Grafic.Botones;

import Grafic.PanelVentanas;
import Grafic.SeleccionViaje;
import Logica.GenerarEstaciones;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonPasoVentan1 extends JButton {
    private PanelVentanas panelVentanas;
    private SeleccionViaje seleccionViaje;
    private GenerarEstaciones generarEstaciones;

    /**
     * metodo constructor del boton para pasar de la ventana 1
     * @param seleccionViaje es la seleccion que se hizo y es a donde se quiere viajar
     * @param panelVentanas es el panel donde se genera el boton
     * @param text es un string de texto
     * @param generarEstaciones es el metodo que genera las estaciones
     */
    public BotonPasoVentan1(SeleccionViaje seleccionViaje, PanelVentanas panelVentanas, String text, GenerarEstaciones generarEstaciones){
        super(text);
        this.seleccionViaje=seleccionViaje;
        this.generarEstaciones=generarEstaciones;
        this.panelVentanas=panelVentanas;
        this.addActionListener(new EscuchadorBotton());
    }

    /**
     * metodo para el escuchador del boton para pasar de la ventana 1
     */
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if(generarEstaciones.getEstacion(seleccionViaje.getOrigen(), seleccionViaje.getDestino())==null){
                panelVentanas.avanceVentana1();
            }
            else{
                System.out.println(generarEstaciones.getEstacion(seleccionViaje.getOrigen(), seleccionViaje.getDestino()));
                panelVentanas.avanceVentana2(generarEstaciones.getEstacion(seleccionViaje.getOrigen(), seleccionViaje.getDestino()));
            }
        }
    }
}
