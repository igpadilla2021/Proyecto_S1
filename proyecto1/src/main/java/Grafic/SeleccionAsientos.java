package Grafic;

import javax.swing.*;
import java.awt.*;

public class SeleccionAsientos extends JPanel{
    private PanelVentanas panelVentanas;
    private JButton retornoButton;
    private JButton siguienteButton;
    public SeleccionAsientos(PanelVentanas panelVentanas) {
        this.panelVentanas = panelVentanas;

        this.setLayout(null);
        this.setBackground(new Color(245, 222, 179));

        retornoButton = new BotonCambio(2,panelVentanas,"CAMBIAR BUS");
        siguienteButton = new BotonCambio(1,panelVentanas,"RESERVAR ASIENTOS");
        retornoButton.setBounds(100,100,200,200);
        siguienteButton.setBounds(350,100,200,200);
        this.add(retornoButton);
        this.add(siguienteButton);
    }

}
