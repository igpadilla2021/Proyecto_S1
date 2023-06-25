package Grafic.Botones;

import Grafic.PanelVentanas;
import Grafic.SeleccionBus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonPasoVentana2 extends JButton {
    private int numVentana;
    private PanelVentanas panelVentanas;
    private SeleccionBus seleccionBus;
    public BotonPasoVentana2(SeleccionBus seleccionBus,PanelVentanas panelVentanas, String text){
        super(text);
        this.panelVentanas=panelVentanas;
        this.seleccionBus=seleccionBus;
        this.addActionListener(new EscuchadorBotton());
    }
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (seleccionBus.getbus().getNumAsientos()==30){
                panelVentanas.avanceVentana3(1,seleccionBus.getbus());
            }
            else if (seleccionBus.getbus().getNumAsientos()==42){
                panelVentanas.avanceVentana3(2,seleccionBus.getbus());
            }
        }
    }
}
