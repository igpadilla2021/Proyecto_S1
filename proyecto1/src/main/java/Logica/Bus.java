package Logica;
import java.util.ArrayList;
import java.util.Random;

public abstract class Bus {
    private int numAsientos;
    private String nameBus;
    private ArrayList<Asiento> asientosList;
    private String[] names={"Busses BIO BIO", "Pullman Bus", "Turbus", "Pullman Tour"};
    private Random rand = new Random();

    public Bus(int numAsientos) {
        this.nameBus=names[rand.nextInt(names.length)];
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

    public String getName(){
        return nameBus;
    }
}
