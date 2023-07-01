package Logica;

public class Abastecimiento {
    /**
     * se definen 2 tipos de buses, semicama y saloncama
     */
    private Semi_cama semi_cama;
    private Salon_cama salonCama;

    /**
     * se crea una intancia de clase por cada tipo de cama
     */
    public Abastecimiento() {
        semi_cama = new Semi_cama();
        salonCama = new Salon_cama();
    }
    /**
     *
     * @return bus de tipo semi_cama
     */
    public Semi_cama getSemi_cama() {
        return semi_cama;
    }
    /**
     *
     * @return bus de tipo saln_cama
     */
    public Salon_cama getSalonCama() {
        return salonCama;
    }
}