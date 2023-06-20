package Grafic;

import javax.swing.*;
import java.awt.event.ActionListener;

public class panelBus extends JPanel {

    public panelBus(){
        this.setLayout(null);
        this.setBounds(540, 240, 1080, 240);

        JLabel nombreBus = new JLabel();
        nombreBus.setText("turbus");
        nombreBus.setBounds(null);

        JLabel horaSalida = new JLabel();
        horaSalida.setText("lahora");
        horaSalida.setBounds(null);

        JLabel tipoAsiento = new JLabel();
        tipoAsiento.setText("super cama deluxe 360");
        tipoAsiento.setBounds(null);

        JLabel precio = new JLabel();
        precio.setText("6 millones");
        precio.setBounds(null);

        JButton bComprar = new JButton();
        bComprar.setText("COMPRAR");
        bComprar.setBounds(null);

    }

}
