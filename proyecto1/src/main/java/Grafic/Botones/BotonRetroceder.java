package Grafic.Botones;

import Grafic.PanelVentanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonRetroceder extends JButton {
    private int numVentana;
    private PanelVentanas panelVentanas;
    public BotonRetroceder(int numVentana, PanelVentanas panelVentanas, String text){
        super(text);
        this.panelVentanas=panelVentanas;
        this.numVentana=numVentana;
        this.addActionListener(new EscuchadorBotton());
    }
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
