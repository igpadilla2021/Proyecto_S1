package Grafic;

import javax.swing.*;

public class destinosCB {

    destinosCB(){
        String destinos[] = {"concepcion", "chillan", "santiago"};
        JComboBox cb = new JComboBox(destinos);
        cb.setBounds(40, 40, 90, 20);
    }
}
