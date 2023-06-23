package Grafic;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Ventana extends JFrame {
    PanelVentanas PV;
    public Ventana() throws IOException {
        super();
        this.setTitle("Reserva");
        this.setLayout(new BorderLayout());

        PV = new PanelVentanas();
        this.add(PV, BorderLayout.CENTER);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,700);
        this.setVisible(true);
    }
}
