import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class botonBuscar extends JButton {

    public botonBuscar(String n){
        super(n);
        //this.actionListener(new escuchadorBoton());
    }

    public class escuchadorBoton implements ActionListener {
        public void actionPerformed(ActionEvent ae){


        }
    }
}

