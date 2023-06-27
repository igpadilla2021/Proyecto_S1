/**
 * clase que define a los buses
 * @author Ignacio padilla
 * @author Joaquin garcia
 */

package Logica;
import java.util.ArrayList;
import java.util.Random;

public abstract class Bus {
    private int numAsientos;
    private String nameBus;
    private ArrayList<Asiento> asientosList;
    private String[] names={"Buses BIO BIO", "Pullman Bus", "Turbus", "Pullman Tour"};
    private Random rand = new Random();

    /**
     * metodo constructor que se encarga de generar un bus, con sus respectivo nombre y asientos
     * @param numAsientos es el numero de asientos que tiene el bus
     */
    public Bus(int numAsientos) {
        this.nameBus=names[rand.nextInt(names.length)];
        this.numAsientos = numAsientos;
        asientosList = new ArrayList<>();
        for (int c = 1; c <= numAsientos; c++) {
            asientosList.add(new Asiento(c));
        }
    }

    /**
     * metodo para reservar un asiento en la lista de asientos del bus
     * @param numero numero del asiento
     */
    public void reservar(int numero) {
        Asiento asiento = asientosList.get(numero - 1);
        asiento.reservarAsiento();
    }

    /**
     * metodo que te da el asiento
     * @param numero numero del asiento
     * @return retorna el asiento
     */
    public Asiento getAsiento(int numero) {
        Asiento asiento = asientosList.get(numero - 1);
        return asiento;
    }

    /**
     * metodo para obtener el numero del asiento
     * @return retorna el numero del asiento
     */
    public int getNumAsientos() {
        return numAsientos;
    }

    /**
     * metodo para obtener el nombre del bus
     * @return retorna el nombre del bus
     */
    public String getName(){
        return nameBus;
    }
    public int getNumDisponibles(){
        int disponibles = numAsientos;
        for (int c = 0; c < numAsientos; c++) {
            if(asientosList.get(c).getEstado()){
                disponibles= disponibles - 1;
            }
        }
        return disponibles;
    }
}
