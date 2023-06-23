package Grafic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonCambio extends JButton {
    private int numVentana;
    private PanelVentanas panelVentanas;
    private JButton avanzarButton;
    public BotonCambio(int numVentana, PanelVentanas panelVentanas, String text){
        super(text);
        this.panelVentanas=panelVentanas;
        this.numVentana=numVentana;
        this.addActionListener(new EscuchadorBotton());
    }
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (numVentana==1){
                panelVentanas.CambioVentana(numVentana);
            }
            if (numVentana==2){
                panelVentanas.CambioVentana(numVentana);
            }
            if (numVentana==3){
                panelVentanas.CambioVentana(numVentana);
            }
        }
    }
}
