package src.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.Circuito;
import src.Mecanico;
import src.PantallaLED;
import src.Piloto;
import src.Sponsor;
import src.interfaces.INombreParaLED;

public class PantallaLEDTest {

     @Test
    public void pantalla_led_piloto() {
        INombreParaLED  piloto = new Piloto("Franco Colapinto","Argentina");
        PantallaLED pantallaLED = new PantallaLED(piloto);
        assertEquals("Piloto: Franco Colapinto", pantallaLED.getObjeto());
    }

    @Test
    public void pantalla_led_mecanico() {
        INombreParaLED  mecanico = new Mecanico("Argentina", "Mecanico1");
        PantallaLED pantallaLED = new PantallaLED(mecanico);
        assertEquals("Mecanico: Mecanico 1", pantallaLED.getObjeto());
    }

    @Test
    public void pantalla_led_sponsor() {
        INombreParaLED  sponsor = new Sponsor("Bizarrap");
        PantallaLED pantallaLED = new PantallaLED(sponsor);
        assertEquals("Sponsor: Bizarrap", pantallaLED.getObjeto());
    }

//no llegue a hacer este
    @Test
    public void pantalla_led_circuito() {
        INombreParaLED  circuito = new Circuito("Austin", 72.5, 71);
        PantallaLED pantallaLED = new circuito();
        assertEquals("Circuito: Austin (Longitud XXX mts.)", pantallaLED.getTexto());
    }

    
}
