/**
 * clase que define el el boton para retroceder
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Grafic.Botones;

import Grafic.PanelVentanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonRetroceder extends JButton {
    private int numVentana;
    private PanelVentanas panelVentanas;

    /**
     * metodo constructor que se encarga de generar el boton para retroceder
     * @param numVentana es el numero de la ventana, para saber en que ventana estamos
     * @param panelVentanas es el panel de la ventana
     * @param text string de texto
     */
    public BotonRetroceder(int numVentana, PanelVentanas panelVentanas, String text){
        super(text);
        this.panelVentanas=panelVentanas;
        this.numVentana=numVentana;
        this.addActionListener(new EscuchadorBotton());
    }

    /**
     * metodo que se encarga del escuchador del boton para retroceder. Este hace que se retroceda a la ventana correspondiente
     */
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (numVentana==1){
                panelVentanas.retrocesoVentana(1);
            }
            if (numVentana==2){
                panelVentanas.retrocesoVentana(2);
            }
            if (numVentana==3){
                panelVentanas.retrocesoVentana(3);
            }
        }
    }
}
