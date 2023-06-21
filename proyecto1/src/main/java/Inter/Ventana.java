package Inter;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Ventana extends JFrame {
    Seleccion select;
    public Ventana() throws IOException {
        super();
        this.setTitle("Reserva");
        this.setLayout(new BorderLayout());

        select = new Seleccion();
        this.add(select, BorderLayout.CENTER);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,700);
        this.setVisible(true);

    }
}
