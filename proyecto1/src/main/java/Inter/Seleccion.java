package Inter;

import javax.swing.*;
import java.awt.*;
import  java.io.*;
import javax.swing.ImageIcon;


public class Seleccion extends JPanel {
    private  JComboBox<String> ciudadOrigen;
    private JComboBox<String> ciudadDestino;
    private JButton confirmarButton;
    private JLabel imagenUbicacion;
    private JLabel salida;
    private JLabel llegada;

    public Seleccion() throws IOException {
        this.setLayout(null);
        this.setBackground(new Color(245,222,179));

        ciudadOrigen = new JComboBox<>(new String[]{"Concepcion", "Chillan", "Los Angeles", "yumbel"});
        ciudadDestino = new JComboBox<>(new String[]{"Concepcion", "Chillan", "Los Angeles", "yumbel"});
        salida=new JLabel("SELECCIONAR CIUDAD DE ORIGEN : ");
        llegada=new JLabel("SELECCIONAR CIUDAD DE LLEGADA :");
        confirmarButton = new JButton("¡ BUSCAR !"); //se usara para cambio de pagina

        imagenUbicacion = new JLabel();
        ImageIcon imagen = new ImageIcon("C:\\Users\\igpad\\OneDrive\\Documentos\\GitHub\\Proyecto_S1\\proyecto1\\src\\main\\java\\JPG\\gps1.png");
        imagenUbicacion.setIcon(imagen);

        int x=320;
        salida.setBounds(x, 20, 300,20);
        this.add(salida);
        llegada.setBounds(x, 170, 300,20);
        this.add(llegada);

        ciudadOrigen.setBounds(x,50,300,100);
        this.add(ciudadOrigen);
        ciudadDestino.setBounds(x,200,300,100);
        this.add(ciudadDestino);

        imagenUbicacion.setBounds(60,70,192,192);
        this.add(imagenUbicacion);
        confirmarButton.setBounds(250,450,300,100);
        this.add(confirmarButton);
    }
}