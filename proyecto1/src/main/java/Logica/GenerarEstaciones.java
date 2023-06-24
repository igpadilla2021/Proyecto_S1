package Logica;

import java.util.ArrayList;
import java.util.List;

public class GenerarEstaciones {
    private List<Estacion> viajes;
    private int cantidad=0;
    private List<List<String>> combinaciones;
    public GenerarEstaciones(String[] listaCiudades){
        viajes=new ArrayList<>();
        combinaciones = new ArrayList<>();
        for (String elementoLista1:listaCiudades) {
            for (String elementoLista2:listaCiudades) {
                if (elementoLista1!=elementoLista2) {
                    List<String> combinacion = new ArrayList<>();
                    combinacion.add(elementoLista1);
                    combinacion.add(elementoLista2);
                    combinaciones.add(combinacion);
                }
            }
        }

        for (List<String> combinacion : combinaciones) {
            viajes.add(new Estacion());
            cantidad=cantidad+1;
        }
    }
    public Estacion getEstacion(String origen, String destino){
        int viaje=0;
        Estacion estacion=null;
        for (List<String> combinacion : combinaciones){
            if (combinacion.get(0)==origen && combinacion.get(1)==destino){
                estacion=viajes.get(viaje);
            }
            viaje=viaje+1;
        }
        return estacion;
    }
}
