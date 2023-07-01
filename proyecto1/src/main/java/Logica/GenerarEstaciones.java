/**
 * clase que se encarga de generar las las estaciones
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Logica;

import java.util.ArrayList;
import java.util.List;

public class GenerarEstaciones {
    /**
     * se tienen 2 listas, una encargada de alamacenar los posibles viajes y la otra almacena las estaciones asosiadas
     * a cada combinacion, y un entero equivalente a la cantidad de estaciones
     */
    private List<Estacion> viajes;
    private int cantidad=0;
    private List<List<String>> combinaciones;

    /**
     * metodo constructor para generar una cantidad de estaciones por cada posible conmbinacion de la lista de ciudades
     * ingresada y ademas de asignar una estacion a cada posible combinacion
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
     * metodo para obtener la estacion asosiada al origen y destino que deseamos
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
