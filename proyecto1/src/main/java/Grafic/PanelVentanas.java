package Grafic;

import Logica.Bus;
import Logica.Estacion;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
public class PanelVentanas extends JPanel{
    private SeleccionViaje seleccionViaje;
    private SeleccionBus seleccionBus;
    private SeleccionAsientos seleccionAsientos;
    public PanelVentanas() throws IOException {
        super();
        this.setLayout(new BorderLayout());


        seleccionViaje = SeleccionViaje.getInstance(this);
        avanceVentana1();
    }

    public void avanceVentana1(){
        removeAll();
        this.add(seleccionViaje, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    public void avanceVentana2(Estacion estacion){
        removeAll();
        seleccionBus = new SeleccionBus(this, estacion);
        this.add(seleccionBus, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
        public void avanceVentana3(int op, Bus bus){
        removeAll();
        if(op==1){
            seleccionAsientos=new SeleccionAsientos(this,op,bus);
            this.add(seleccionAsientos, BorderLayout.CENTER);
        }
        else if(op==2){
            seleccionAsientos=new SeleccionAsientos(this,op,bus);
            this.add(seleccionAsientos, BorderLayout.CENTER);
        }
        revalidate();
        repaint();
    }
    public void retrocesoVentana(int ventana){
        removeAll();
        if(ventana==1){
            this.add(seleccionViaje, BorderLayout.CENTER);
        }
        if(ventana==2){
            this.add(seleccionBus, BorderLayout.CENTER);
        }
        revalidate();
        repaint();
    }

    public void paint (Graphics g) {
        super.paint(g);
    }
}