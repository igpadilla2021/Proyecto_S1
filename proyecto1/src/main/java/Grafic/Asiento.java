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
    public Asiento(int numAsiento, Bus bus, SeleccionAsientos seleccionAsientos){
        super(Integer.toString(numAsiento));
        this.seleccionAsientos=seleccionAsientos;
        this.bus=bus;
        this.numAsiento=numAsiento;
        this.addActionListener(new EscuchadorBotton());
    }
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
    public void bloquear(){
        this.setEnabled(false);
    }
}
