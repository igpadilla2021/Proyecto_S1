package Grafic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Asiento  extends JButton {
    private int numAsiento;
    public Asiento(int numAsiento){
        super(Integer.toString(numAsiento));
        this.numAsiento=numAsiento;
        this.setBackground(Color.GREEN);
        this.addActionListener(new EscuchadorBotton());
    }
    public class EscuchadorBotton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            System.out.println("funciona");
        }
    }
}
