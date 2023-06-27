/**
 * clase que se encarga de generar las las estaciones
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Logica;

import java.util.ArrayList;
import java.util.List;

public class GenerarEstaciones {
    private List<Estacion> viajes;
    private int cantidad=0;
    private List<List<String>> combinaciones;

    /**
     * metodo constructor para generar una cantidad de estaciones
     * @param listaCiudades es una lista con las ciudades
     */
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

    /**
     * metodo para obtener la estacion en la que estamos
     * @param origen origen donde se encuentra la estacion
     * @param destino destino
     * @return retorna la estacion
     */
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
