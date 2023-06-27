/**
 * clase que define la generacion de los asientos semi cama
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Grafic;

import Logica.Bus;

import javax.swing.*;
import java.awt.*;

public class GenerarSemiCama extends JPanel {
    private int cantidadAsientos=30;
    private Asiento asiento;

    /**
     * metodo constructor para generar la sala de bus con asientos semi cama.
     * @param bus es el bus en el cual se va a construir la sala de asientos salon cama
     * @param seleccionAsientos metodo que se encarga de la seleccion de asientos
     */
    public GenerarSemiCama(Bus bus, SeleccionAsientos seleccionAsientos){
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
                asiento=new Asiento(j+num ,bus, seleccionAsientos);
                if (bus.getAsiento(j+num).getEstado()==false){
                    asiento.setBackground(Color.GREEN);
                }
                else{
                    asiento.bloquear();
                    asiento.setBackground(Color.RED);
                }
                asiento.setBounds(x,y,50,50);
                this.add(asiento);
                y=y+60;
            }
            num=num+1;
        }
    }

}
