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
    public BotonReservar(SeleccionAsientos seleccionAsientos,Bus bus, PanelVentanas panelVentanas, String text){
        super(text);
        this.bus=bus;
        this.panelVentanas=panelVentanas;
        this.seleccionAsientos=seleccionAsientos;
        this.addActionListener(new EscuchadorBotton());
    }
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            int[] reservados=seleccionAsientos.getReservados();
            for (int c=0; c<42; c=c+1){
                if (reservados[c]!=0){
                    bus.reservar(c+1);
                }
            }
            panelVentanas.retrocesoVentana(1);
        }
    }
}

