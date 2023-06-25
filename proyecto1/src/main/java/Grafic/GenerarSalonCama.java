package Grafic;

import Logica.Bus;

import javax.swing.*;
import java.awt.*;

public class GenerarSalonCama extends JPanel {
    private int cantidadAsientos=12;
    private Asiento asiento;
    public GenerarSalonCama(Bus bus, SeleccionAsientos seleccionAsientos){
        this.setLayout(null);

        //generador de asientos
        int x=20;
        int num=1;
        for(int i=0; i<4; i=i+1){
            int y=20;
            if(i==1 || i==3){ x=x+60; }
            if(i==2){ x=x+100; }
            for(int j=0; j<cantidadAsientos; j=j+4){
                if(j+num>=31){
                    break;
                }
                asiento=new Asiento(j+num+30, bus, seleccionAsientos);
                if (bus.getAsiento(j+num+30).getEstado()==false){
                    asiento.setBackground(Color.blue);
                }
                else {
                    asiento.bloquear();
                    asiento.setBackground(Color.red);
                }
                asiento.setBounds(x,y,50,50);
                this.add(asiento);
                y=y+80;
            }
            num=num+1;
        }
    }
}
