/**
 * clase que define la ventana
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Grafic;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Ventana extends JFrame {
    PanelVentanas PV;

    /**
     * metodo constructor de el frame Ventana, donde se crea y ubica todo lo grafico. Establece un nombre para la ventana,
     *los bordes, el tamaño y que se pueda cerrar con el boton de x
     * @throws IOException
     */
    public Ventana() throws IOException {
        super();
        this.setTitle("Reserva");
        this.setLayout(new BorderLayout());

        PV = new PanelVentanas();
        this.add(PV, BorderLayout.CENTER);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(814,737);  // width: 800, height:700
        this.setVisible(true);
    }
}
