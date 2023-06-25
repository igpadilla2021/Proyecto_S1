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

    public SeleccionAsientos(PanelVentanas panelVentanas, int servicio, Bus bus) {
        this.panelVentanas = panelVentanas;
        this.setLayout(null);
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
        siguienteButton = new BotonReservar(this,bus,panelVentanas,"RESERVAR ASIENTOS");
        retornoButton.setBounds(0,600,200,100);
        siguienteButton.setBounds(600,600,200,100);
        this.add(retornoButton);
        this.add(siguienteButton);
    }
    public void seleccionar(int num){
        cantidadReservar=cantidadReservar+1;
        if(cantidadReservar<15){
            asientosList[num-1]=num;
        }
    }
    public void desselccionar(int num){
        cantidadReservar=cantidadReservar-1;
        asientosList[num-1]=0;
    }
    public void paint (Graphics g) {
        super.paint(g);
        g.setColor(new Color(255,99,71));
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
        g.drawString("ASIENTOS SELECCIONADOS",260,570);
        font = new Font("Arial", Font.PLAIN, 15);
        g.setFont(font);
        g.drawString(asientosString,230,620);
        g.setColor(Color.GREEN);
        g.fillRect(400,325,35,35);
        g.setColor(Color.blue);
        g.fillRect(400,375,35,35);
        g.setColor(Color.red);
        g.fillRect(400,425,35,35);
    }
    public int[] getReservados(){
        return asientosList;
    }
}
