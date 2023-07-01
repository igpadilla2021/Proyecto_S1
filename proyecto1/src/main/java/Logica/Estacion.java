package Logica;
import java.util.ArrayList;

public class Estacion {
    /**
     * se definen 2 enteros, cada uno asosiado a un tipo de bus, y ademas una lista que almacenara el abastecimiento de
     * buses para cada hora
     */
    public static final int SEMI_CAMA = 1;
    public static final int SALON_CAMA = 2;
    private ArrayList<Abastecimiento> abastecimientoList;

    /**
     * metodo constructor que se encarga de egenerar un abastecimiento de buses por cada hora de
     * servicio (de 8:00 a 22:00)
     */
    public Estacion() {
        abastecimientoList = new ArrayList<>();
        for (int c = 8; c < 22 + 1; c = c + 1) {
            abastecimientoList.add(new Abastecimiento());
        }
    }
    /**
     *
     * @return bus del tipo y horario seleccionado
     */
    public Bus getBus(int cual_bus, int cual_horario){
        Abastecimiento hora = abastecimientoList.get(cual_horario - 8);
        if (cual_bus == SEMI_CAMA) {
            return hora.getSemi_cama();
        }
        else {
            return hora.getSalonCama();
        }
    }
}