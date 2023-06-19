package Logica;
import java.util.ArrayList;

public abstract class Bus {
    private int numAsientos;
    private ArrayList asientosList;
    public Bus(int numAsientos){
        this.numAsientos=numAsientos;
        asientosList= new ArrayList<>();
        for (int c=1; c<numAsientos+1; c++) {
            asientosList.add(new Asiento(c));
        }
    }
    public void reservar(int numero){
        Asiento asiento = (Asiento) asientosList.get(numero-1);
        asiento.reservarAsiento();
    }
    public boolean getEstado(int numero){
        Asiento asiento = (Asiento) asientosList.get(numero-1);
        return asiento.getEstado();
    }
    public int getNumero(int numero){
        Asiento asiento = (Asiento) asientosList.get(numero-1);
        return asiento.getNumero();
    }
}
