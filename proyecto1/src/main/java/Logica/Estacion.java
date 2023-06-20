package Logica;
import java.util.ArrayList;

public class Estacion {
    public static final int SEMI_CAMA = 1;
    public static final int SALON_CAMA = 2;
    private static Estacion instance;
    private ArrayList<Abastecimiento> abastecimientoList;

    private Estacion() {
        abastecimientoList = new ArrayList<>();
        // incorporar nombres asociados a los buses
        for (int c = 8; c < 22 + 1; c = c + 1) {
            abastecimientoList.add(new Abastecimiento());
        }
    }

    /** implementacion de patron singleton con le objetivo que haya una unica instancia de Estacion */
    public static Estacion getInstance() {
        if (instance == null) {
            instance = new Estacion();
        }
        return instance;
    }

    public void reservarAsiento(int cual_bus, int cual_numero, int cual_horario) {
        Abastecimiento hora = abastecimientoList.get(cual_horario - 8);
        if (cual_bus == SEMI_CAMA) {
            hora.getSemi_cama().reservar(cual_numero);
        }
        if (cual_bus == SALON_CAMA) {
            hora.getSalonCama().reservar(cual_numero);
        }
    }

    public Asiento getAsiento(int cual_bus, int cual_numero, int cual_horario) {
        Abastecimiento hora = abastecimientoList.get(cual_horario - 8);
        if (cual_bus == SEMI_CAMA) {
            return hora.getSemi_cama().getAsiento(cual_numero);
        }
        else {
            return hora.getSalonCama().getAsiento(cual_numero);
        }
    }
    public Bus getBus(int cual_bus, int cual_numero, int cual_horario){
        Abastecimiento hora = abastecimientoList.get(cual_horario - 8);
        if (cual_bus == SEMI_CAMA) {
            return hora.getSemi_cama();
        }
        else {
            return hora.getSalonCama();
        }
    }
}