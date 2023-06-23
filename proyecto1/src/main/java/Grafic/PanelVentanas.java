package Grafic;

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

        seleccionViaje = new SeleccionViaje(this);
        seleccionBus = new SeleccionBus(this);
        seleccionAsientos=new SeleccionAsientos(this);

        CambioVentana(1);
    }

    public void CambioVentana(int ventana){
        removeAll();
        if(ventana==1){
            this.add(seleccionViaje, BorderLayout.CENTER);
        }
        if(ventana==2){
            this.add(seleccionBus, BorderLayout.CENTER);
        }
        if(ventana==3){
            this.add(seleccionAsientos, BorderLayout.CENTER);
        }
        revalidate();
        repaint();
    }

    public void paint (Graphics g) {
        super.paint(g);
        seleccionViaje.repaint();
        seleccionBus.repaint();
    }
}