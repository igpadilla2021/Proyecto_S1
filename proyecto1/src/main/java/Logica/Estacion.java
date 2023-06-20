package Logica;
import java.util.ArrayList;

public class Estacion {
    public static final int SEMI_CAMA=1;
    public static final int  SALON_CAMA=2;

    private ArrayList abastecimientoList;

    // 15 horas
    public Estacion(){
        abastecimientoList=new ArrayList<>();
        for (int c=8; c<22+1; c=c+1) {
            abastecimientoList.add(new Abastecimiento());
        }
    }
    public void reservarAsiento(int cual_bus, int cual_numero,int cual_horario){
        Abastecimiento horario= (Abastecimiento) abastecimientoList.get(cual_horario-8);
        if(cual_bus==SEMI_CAMA){
          horario.getSemi_cama().reservar(cual_numero);
        }
        if(cual_bus==SALON_CAMA){
          horario.getSalonCama().reservar(cual_numero);
        }
    }
    public Asiento getAsiento(int cual_bus, int cual_numero,int cual_horario){
        Abastecimiento horario= (Abastecimiento) abastecimientoList.get(cual_horario-8);
        if(cual_bus==SEMI_CAMA){
            return horario.getSemi_cama().getAsiento(cual_numero);
        }
        else{
            return horario.getSalonCama().getAsiento(cual_numero);
        }
    }
}
