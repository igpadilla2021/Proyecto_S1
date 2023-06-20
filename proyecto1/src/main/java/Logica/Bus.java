package Logica;
import java.util.ArrayList;

public abstract class Bus {
    private int numAsientos;
    private ArrayList<Asiento> asientosList;

    public Bus(int numAsientos) {
        this.numAsientos = numAsientos;
        asientosList = new ArrayList<>();
        for (int c = 1; c <= numAsientos; c++) {
            asientosList.add(new Asiento(c));
        }
    }

    public void reservar(int numero) {
        Asiento asiento = asientosList.get(numero - 1);
        asiento.reservarAsiento();
    }

    public Asiento getAsiento(int numero) {
        Asiento asiento = asientosList.get(numero - 1);
        return asiento;
    }
}
