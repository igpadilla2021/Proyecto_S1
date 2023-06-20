package Grafic;

import javax.swing.*;
import java.awt.*;

public class ventana1 extends JFrame {
    public ventana1(){
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("titulo");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setSize(1080, 720);
        this.setVisible(true);

        panelPrincipal panel = new panelPrincipal();
    }
}
