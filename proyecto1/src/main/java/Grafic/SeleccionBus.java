package Grafic;

import javax.swing.*;
import java.awt.*;


public class SeleccionBus extends JPanel {
    private PanelVentanas panelVentanas;
    private JButton retornoButton;
    private JButton siguienteButton;
    public SeleccionBus(PanelVentanas panelVentanas) {
        this.panelVentanas = panelVentanas;
        this.setLayout(null);
        this.setBackground(new Color(245, 222, 179));

        retornoButton = new BotonCambio(1,panelVentanas,"CAMBIAR VIAJE");
        siguienteButton = new BotonCambio(3,panelVentanas,"SELECCIONAR ASIENTOS");
        retornoButton.setBounds(100,100,200,200);
        siguienteButton.setBounds(350,100,200,200);
        this.add(retornoButton);
        this.add(siguienteButton);
    }
}
