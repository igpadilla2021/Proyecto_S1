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

        seleccionViaje = SeleccionViaje.getInstance(this);
        CambioVentana1();
    }

    public void CambioVentana1(){
        removeAll();
        this.add(seleccionViaje, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    public void CambioVentana2(){
        removeAll();
        seleccionBus = new SeleccionBus(this);
        this.add(seleccionBus, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void CambioVentana3(){
        removeAll();
        seleccionAsientos=new SeleccionAsientos(this);
        this.add(seleccionAsientos, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void paint (Graphics g) {
        super.paint(g);
    }
}