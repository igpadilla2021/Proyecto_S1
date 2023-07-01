package Logica;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class EstacionTest {

    @Test
    @DisplayName("Test verificar tipo de bus seleccionado")
    public void testEstacionGetBus() {
        Estacion estacion=new Estacion();
        int bus=Estacion.SEMI_CAMA;
        int cualhorario=22;
        int esperado=30;
        int cantidad=estacion.getBus(bus, cualhorario).getNumAsientos();
        Assert.assertEquals(esperado, cantidad);
    }
}