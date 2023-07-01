package Logica;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class AsientoTest {

    @Test
    @DisplayName("Test verificar reserva de asiento")
    public void testAsientoNoDisponible() {
        Asiento asiento=new Asiento(1);
        asiento.reservarAsiento();
        boolean estado=asiento.getEstado();
        Assert.assertTrue(estado);
    }

    @Test
    @DisplayName("Test verificar disponibilidad inicial")
    public void testAsientoDisponible() {
        Asiento asiento=new Asiento(2);
        boolean estado=asiento.getEstado();
        Assert.assertFalse(estado);
    }
}