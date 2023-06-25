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
    public BotonPasoVentan1(SeleccionViaje seleccionViaje, PanelVentanas panelVentanas, String text, GenerarEstaciones generarEstaciones){
        super(text);
        this.seleccionViaje=seleccionViaje;
        this.generarEstaciones=generarEstaciones;
        this.panelVentanas=panelVentanas;
        this.addActionListener(new EscuchadorBotton());
    }
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
