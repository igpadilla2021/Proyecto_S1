/**
 * clase que define el panel para seleccionar bus
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Grafic;

import Grafic.Botones.BotonPasoVentana2;
import Grafic.Botones.BotonRetroceder;
import Logica.Bus;
import Logica.Estacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SeleccionBus extends JPanel {
    private PanelVentanas panelVentanas;
    private JButton retornoButton;
    private JButton siguienteButton;
    private JList<String>  list;
    private Bus[] buses;
    private Bus bus=null;
    private SeleccionBus seleccionBus;

    /**
     * metodo constructor para la seleccion de bus, genera las opciones de buses y cambia la fuente de las letras
     * @param panelVentanas ventana en la que nos ubicamos
     * @param estacion es la estacion
     */
    public SeleccionBus(PanelVentanas panelVentanas, Estacion estacion) {
        this.panelVentanas = panelVentanas;
        this.setLayout(null);
        seleccionBus=this;

        String[] opciones = new String[30];
        buses = new Bus[30];
        int p = 0;
        for (int c = 8; c < 23; c = c + 1) {
            Bus b1 = estacion.getBus(Estacion.SEMI_CAMA, c);
            String bus1 = "   " + b1.getName() + "        salida: " + c + ":00" + "        SERVICIO: semi_cama";
            opciones[p] = bus1;
            buses[p] = b1;
            p = p + 1;
            Bus b2 = estacion.getBus(Estacion.SALON_CAMA, c);
            String bus2 = "   " + b2.getName() + "        salida: " + c + ":00" + "        SERVICIO: semi_cama y salon cama";
            opciones[p] = bus2;
            buses[p] = b2;
            p = p + 1;
        }

        //cambio de tamaño y formato letras para que se vea mejor y mas grande
        list = new JList<>(opciones);
        Font listFont = new Font("Arial", Font.PLAIN, 16);
        int listSpacing = 100;
        list.setFont(listFont);
        list.setFixedCellHeight(listFont.getSize() + listSpacing);
        list.setBackground(new Color(255,222,173));

        list.addMouseListener(new ElegirBus());
        JScrollPane seleccion = new JScrollPane(list);
        seleccion.addMouseListener(new ElegirBus());
        seleccion.setBounds(0, 0, 800, 600);

        retornoButton = new BotonRetroceder(1, panelVentanas, "CAMBIAR VIAJE");
        retornoButton.setBackground(new Color(255,99,71));
        siguienteButton = new BotonPasoVentana2(this,panelVentanas,"SELECCIONAR ASIENTOS");
        siguienteButton.setEnabled(false);
        siguienteButton.setBackground(new Color(255,99,71));
        retornoButton.setBounds(0,600,200,100);
        siguienteButton.setBounds(600,600,200,100);

        this.add(seleccion);
        this.add(retornoButton);
        this.add(siguienteButton);
    }

    /**
     * metodo para seleccionar la opcion de bus que se quiere comprar
     */
    public class ElegirBus extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            int seleccionado = list.getSelectedIndex();
            bus = buses[seleccionado];
            siguienteButton.setEnabled(true);
            pintar();
        }
    }

    /**
     * metodo para obtener el bus
     * @return retorna el bus
     */
    public Bus getbus(){
        return bus;
    }

    public void pintar(){
        seleccionBus.repaint();
    }

    /**
     * metodo para pintar la ventana
     * @param g es el pincel
     */
    public void paint (Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.PLAIN, 20);
        g.setFont(font);
        g.drawString("ASIENTOS DISPONIBLES",280,625);
        if(bus!=null){
            g.setColor(new Color(255,99,71));
            font = new Font("Arial", Font.PLAIN, 50);
            g.setFont(font);
            g.drawString(bus.getNumDisponibles()+"/"+bus.getNumAsientos(),330,675);
        }
    }
}