package Grafic;

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
    private SeleccionViaje(PanelVentanas panelVentanas) throws IOException {
        this.panelVentanas=panelVentanas;
        this.setLayout(null);
        this.setBackground(new Color(245,222,179));

        ciudades=new String[]{"Concepcion", "Chillan", "Santiago", "yumbel"};
        ciudadOrigen = new JComboBox<>(ciudades);
        ciudadDestino = new JComboBox<>(ciudades);
        generarEstaciones= new GenerarEstaciones(ciudades);
        ciudadOrigen.addActionListener(new SeleccionOrigen());
        ciudadDestino.addActionListener(new SelecionDestino());

        salida=new JLabel("SELECCIONAR CIUDAD DE ORIGEN : ");
        llegada=new JLabel("SELECCIONAR CIUDAD DE LLEGADA :");

        confirmarButton = new BotonBuscar(this,panelVentanas,"¡ BUSCAR !",generarEstaciones);

        imagenUbicacion = new JLabel();
        ImageIcon imagen = new ImageIcon("C:\\Users\\igpad\\OneDrive\\Documentos\\GitHub\\Proyecto_S1\\proyecto1\\src\\main\\java\\JPG\\gps1.png");
        imagenUbicacion.setIcon(imagen);

        int distancia=320;
        salida.setBounds(distancia, 20, 300,20);
        this.add(salida);
        llegada.setBounds(distancia, 170, 300,20);
        this.add(llegada);

        ciudadOrigen.setBounds(distancia,50,300,100);
        this.add(ciudadOrigen);
        ciudadDestino.setBounds(distancia,200,300,100);
        this.add(ciudadDestino);

        imagenUbicacion.setBounds(60,70,192,192);
        this.add(imagenUbicacion);
        confirmarButton.setBounds(250,450,300,100);
        this.add(confirmarButton);
    }

    /** implementacion de patron singleton con le objetivo que haya una unica instancia de SeleccionViaje */
    public static SeleccionViaje getInstance(PanelVentanas panelVentanas) throws IOException {
        if (instance == null) {
            instance = new SeleccionViaje(panelVentanas);
        }
        return instance;
    }

    public class SeleccionOrigen implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            origen = (String) ciudadOrigen.getSelectedItem();
        }
    }
    public String getOrigen(){
        return origen;
    }
    public class SelecionDestino implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            destino = (String) ciudadDestino.getSelectedItem();
        }
    }
    public String getDestino(){
        return destino;
    }
}

