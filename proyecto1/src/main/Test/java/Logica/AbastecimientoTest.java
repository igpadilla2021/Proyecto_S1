package Logica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbastecimientoTest {
    private Semi_cama semi_cama;
    private Salon_cama salon_cama;

    @Test
    void getSemi_cama() {
        semi_cama = new Semi_cama();

        assertEquals(1,semi_cama.getAsiento(1) );

    }

    @Test
    void getSalonCama() {
        salon_cama = new Salon_cama();

        assertEquals(1,salon_cama.getAsiento(1) );

    }
}