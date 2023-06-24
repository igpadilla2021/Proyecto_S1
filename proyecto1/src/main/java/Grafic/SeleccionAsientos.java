package Grafic;

import Logica.Salon_cama;

import javax.swing.*;
import java.awt.*;

public class SeleccionAsientos extends JPanel{
    private PanelVentanas panelVentanas;
    private JButton retornoButton;
    private JButton siguienteButton;
    private GenerarSemiCama asientos1;
    private GenerarSalonCama asientos2;

    public SeleccionAsientos(PanelVentanas panelVentanas) {
        this.panelVentanas = panelVentanas;
        this.setLayout(null);
        this.setBackground(new Color(245, 222, 179));

        //generacion de asientos
        asientos1=new GenerarSemiCama();
        asientos1.setBounds(20,25,315,510);
        this.add(asientos1);
        asientos2=new GenerarSalonCama();
        asientos2.setBounds(400,25,315,250);
        this.add(asientos2);

        //asientos disponibles


        //botones de cambio de ventana
        retornoButton = new BotonCambio(2,panelVentanas,"CAMBIAR BUS");
        siguienteButton = new BotonCambio(1,panelVentanas,"RESERVAR ASIENTOS");
        retornoButton.setBounds(0,600,200,100);
        siguienteButton.setBounds(600,600,200,100);
        this.add(retornoButton);
        this.add(siguienteButton);
    }

}
