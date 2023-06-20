package Logica;

public class Abastecimiento {
    private Semi_cama semi_cama;
    private Salon_cama salonCama;

    public Abastecimiento() {
        semi_cama = new Semi_cama();
        salonCama = new Salon_cama();
    }

    public Semi_cama getSemi_cama() {
        return semi_cama;
    }

    public Salon_cama getSalonCama() {
        return salonCama;
    }
}