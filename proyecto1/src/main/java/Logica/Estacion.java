package Logica;
import java.util.ArrayList;

public class Estacion {
    public static final int SEMI_CAMA = 1;
    public static final int SALON_CAMA = 2;
    private static Estacion instance;
    private ArrayList<Abastecimiento> abastecimientoList;

    public Estacion() {
        abastecimientoList = new ArrayList<>();
        // incorporar nombres asociados a los buses
        for (int c = 8; c < 22 + 1; c = c + 1) {
            abastecimientoList.add(new Abastecimiento());
        }
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