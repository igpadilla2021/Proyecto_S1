package Logica;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class BusTest {
    @Test
    @DisplayName("Test verificar reserva de asiento")
    public void testBusReservarAsiento() {
        Bus bus=new Semi_cama();
        bus.reservar(30);
        Asiento asiento=bus.getAsiento(30);
        boolean estado=asiento.getEstado();
        Assert.assertTrue(estado);
    }

    @Test
    @DisplayName("Test verificar tipo de bus generado")
    public void testBusCantidadAsientos() {
        Bus bus=new Salon_cama();
        int esperado=42;
        int cantidad=bus.getNumAsientos();
        Assert.assertEquals(esperado, cantidad);
    }
}