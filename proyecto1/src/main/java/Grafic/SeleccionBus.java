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

        String[] opciones= new String[30];
        for (int c=0; c<30; c=c+1){
        }
        JList<String> list = new JList<>(opciones);
        Font listFont = new Font("Arial", Font.PLAIN, 16);
        int listSpacing = 100;
        list.setFont(listFont);
        list.setFixedCellHeight(listFont.getSize() + listSpacing);

        JScrollPane seleccion = new JScrollPane(list);
        seleccion.setBounds(0,0,500,600);

        retornoButton = new BotonCambio(1,panelVentanas,"CAMBIAR VIAJE");
        siguienteButton = new BotonCambio(3,panelVentanas,"SELECCIONAR ASIENTOS");
        retornoButton.setBounds(500,100,300,100);
        siguienteButton.setBounds(500,400,300,100);

        this.add(seleccion);
        this.add(retornoButton);
        this.add(siguienteButton);
    }
}