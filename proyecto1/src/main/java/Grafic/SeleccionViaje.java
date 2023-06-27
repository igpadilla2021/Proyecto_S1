/**
 * clase que define el panel para seleccionar el el origen y destino, junto con el boton para buscar
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Grafic;

import Grafic.Botones.BotonPasoVentan1;
import Logica.GenerarEstaciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  java.io.*;
import javax.swing.ImageIcon;


public class SeleccionViaje extends JPanel {
    private  JComboBox<String> ciudadOrigen;
    private JComboBox<String> ciudadDestino;
    private JButton confirmarButton;
    private JLabel imagenUbicacion;
    private JLabel salida;
    private JLabel llegada;
    private PanelVentanas panelVentanas;
    private String[] ciudades;
    private String origen;
    private String destino;
    private static SeleccionViaje instance;

    private GenerarEstaciones generarEstaciones;

    /**
     * metodo constructor para la seleccion de viaje, en la que se selecciona un origen y destino
     * @param panelVentanas es la ventana donde se ubican la seleccion de origen y destino
     * @throws IOException
     */
    private SeleccionViaje(PanelVentanas panelVentanas) throws IOException {
        this.panelVentanas=panelVentanas;
        this.setLayout(null);

        ciudades=new String[]{"Concepcion", "Chillan", "Santiago", "yumbel"};
        // estos son los desplegables con la lista de arriba
        ciudadOrigen = new JComboBox<>(ciudades);
        ciudadDestino = new JComboBox<>(ciudades);
        generarEstaciones= new GenerarEstaciones(ciudades);
        ciudadOrigen.addActionListener(new SeleccionOrigen());
        ciudadDestino.addActionListener(new SelecionDestino());

        salida=new JLabel("SELECCIONAR CIUDAD DE ORIGEN : ");
        llegada=new JLabel("SELECCIONAR CIUDAD DE LLEGADA :");

        confirmarButton = new BotonPasoVentan1(this,panelVentanas,"¡ BUSCAR !",generarEstaciones);
        confirmarButton.setBackground(new Color(255,99,71));

        imagenUbicacion = new JLabel();
        ImageIcon imagen = new ImageIcon("C:\\Users\\igpad\\OneDrive\\Documentos\\GitHub\\Proyecto_S1\\proyecto1\\src\\main\\java\\JPG\\gps1.png");
        imagenUbicacion.setIcon(imagen);

        int distancia=330;
        salida.setBounds(distancia, 70, 300,20);
        this.add(salida);
        llegada.setBounds(distancia, 230, 300,20);
        this.add(llegada);

        ciudadOrigen.setBounds(distancia,100,300,100);
        this.add(ciudadOrigen);
        ciudadDestino.setBounds(distancia,250,300,100);
        this.add(ciudadDestino);

        imagenUbicacion.setBounds(60,120,192,192);
        this.add(imagenUbicacion);
        confirmarButton.setBounds(210,450,350,150);
        this.add(confirmarButton);
    }

    /** implementacion de patron singleton con el objetivo que haya una unica instancia de SeleccionViaje */
    public static SeleccionViaje getInstance(PanelVentanas panelVentanas) throws IOException {
        if (instance == null) {
            instance = new SeleccionViaje(panelVentanas);
        }
        return instance;
    }

    /**
     * metodo que implementa escuchador para el boton donde se selecciona el origen
     */
    public class SeleccionOrigen implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            origen = (String) ciudadOrigen.getSelectedItem();
        }
    }

    /**
     * metodo para conseguir el origen
     * @return retorna el origen
     */
    public String getOrigen(){
        return origen;
    }

    /**
     * metodo que implementa el escuchador para el boton para seleccionar el destino
     */
    public class SelecionDestino implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            destino = (String) ciudadDestino.getSelectedItem();
        }
    }

    /**
     * metodo para conseguir el destino
     * @return retorna el destino
     */
    public String getDestino(){
        return destino;
    }
}

