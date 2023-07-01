/**
 *clase que define el panel para seleccionar asientos
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Grafic;

import Grafic.Botones.BotonReservar;
import Grafic.Botones.BotonRetroceder;
import Logica.Bus;

import javax.swing.*;
import java.awt.*;

public class SeleccionAsientos extends JPanel{
    private PanelVentanas panelVentanas;
    private JButton retornoButton;
    private JButton siguienteButton;
    private GenerarSemiCama asientos1;
    private GenerarSalonCama asientos2;
    private int[] asientosList;
    private int cantidadReservar=0;

    /**
     * metodo constructor de el seleccionador de asientos, el cual se encarga de generar el cuadro seleccionador de
     * asientos, los colores y botones de cambio de ventana
     * @param panelVentanas es el panel en el cual se ubica lo señalado
     * @param servicio es el tipo de asiento que se ofrece
     * @param bus es el bus donde se generan los asientos
     */
    public SeleccionAsientos(PanelVentanas panelVentanas, int servicio, Bus bus) {
        this.panelVentanas = panelVentanas;
        this.setLayout(null);
        this.setBackground(new Color(255,222,173));
        asientosList=new int[42];

        //generacion de graficacion asientos
        if (servicio==1){
            asientos1=new GenerarSemiCama(bus, this);
            asientos1.setBounds(20,25,315,510);
            asientos1.setBackground(new Color(190,190,190));
            this.add(asientos1);
        }
        else{
            asientos1=new GenerarSemiCama(bus, this);
            asientos1.setBounds(20,25,315,510);
            asientos1.setBackground(new Color(190,190,190));
            this.add(asientos1);
            asientos2=new GenerarSalonCama(bus,this);
            asientos2.setBounds(400,25,315,250);
            asientos2.setBackground(new Color(190,190,190));
            this.add(asientos2);
        }

        //botones de cambio de ventana
        retornoButton = new BotonRetroceder(2,panelVentanas,"CAMBIAR BUS");
        retornoButton.setBackground(new Color(255,99,71));
        siguienteButton = new BotonReservar(this,bus,panelVentanas,"RESERVAR ASIENTOS");
        siguienteButton.setEnabled(false);
        siguienteButton.setBackground(new Color(255,99,71));
        retornoButton.setBounds(0,600,200,100);
        siguienteButton.setBounds(600,600,200,100);
        this.add(retornoButton);
        this.add(siguienteButton);
    }

    /**
     * metodo para seleccionar asiento
     * @param num numero para reservar
     */
    public void seleccionar(int num){
        siguienteButton.setEnabled(true);
        cantidadReservar=cantidadReservar+1;
        if(cantidadReservar<15){
            asientosList[num-1]=num;
        }
    }

    /**
     * metodo para deseleccionar asientos
     * @param num numero para reservar
     */
    public void desselccionar(int num){
        int cantidadRervados=0;
        cantidadReservar=cantidadReservar-1;
        asientosList[num-1]=0;
        for (int c=0; c<42; c=c+1){
            if(asientosList[c]!=0){
                cantidadRervados=1;
            }
        }
        if(cantidadRervados==0){
            siguienteButton.setEnabled(false);
        }
    }

    /**
     * metodo que se encarga de "pintar" la ventana
     * @param g  es el pincel
     */
    public void paint (Graphics g) {
        super.paint(g);
        g.setColor(new Color(220,220,240));
        g.fillRect(200,550,400,150);
        // lista de asientos seleccionados hasta el momento
        String asientosString="";
        for (int c=0; c<42; c=c+1){
             if(asientosList[c]!=0){
                 if (asientosString==""){
                     asientosString=asientosString+asientosList[c];
                 }
                 else {
                     asientosString=asientosString+", "+asientosList[c];
                 }
             }
        }
        g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.PLAIN, 20);
        g.setFont(font);
        g.drawString("ASIENTOS SELECCIONADOS",260,580);
        font = new Font("Arial", Font.PLAIN, 15);
        g.drawString(asientosString,230,640);
        g.setColor(Color.GREEN);
        g.fillRect(450,325,35,35);
        g.setColor(Color.blue);
        g.fillRect(450,375,35,35);
        g.setColor(Color.red);
        g.fillRect(450,425,35,35);
        g.setColor(Color.BLACK);
        font = new Font("Arial", Font.PLAIN, 20);
        g.setFont(font);
        g.drawString("Asientos semicama",495,350);
        g.drawString("Asientos saloncama",495,400);
        g.drawString("¡Asientos ocupados!",495,450);
    }

    /**
     * metodo para conseguir los asientos reservados
     * @return retorna la lista de asientos reservados
     */
    public int[] getReservados(){
        return asientosList;
    }
}
