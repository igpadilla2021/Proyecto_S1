package Logica;

public class Asiento {
    private int num;
    private EstadoAsiento estado;

    public Asiento(int num) {
        this.num = num;
        estado = new AsientoDisponible();
    }

    public boolean getEstado() {
        return estado instanceof AsientoOcupado;
    }

    public void reservarAsiento() {
        estado.reservar(this);
    }

    public int getNumero() {
        return num;
    }

    public void setEstado(EstadoAsiento estado) {
        this.estado = estado;
    }
}