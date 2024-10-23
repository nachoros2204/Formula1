package src.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import src.Circuito;
import src.Equipo;
import src.Piloto;
import src.Vuelta;

public class VueltaTest {
    @Test
    public void registrar_vuelta_del_piloto_en_circuito() {
        
        Piloto piloto = new Piloto("Franco Colapinto", "Argentina");
        Circuito circuito = new Circuito("Austin", 1234, 56); // nombre, longitud, cantidad de vueltas
        Equipo equipo = new Equipo("Williams");

        List<Vuelta> listaVueltas = new ArrayList<>();

        Vuelta vuelta1 = new Vuelta(piloto, equipo, circuito, 90.5); // 90.5 segundos en la vuelta
        Vuelta vuelta2 = new Vuelta(piloto, equipo, circuito, 88.1); // 88.1 segundos en la vuelta
        Vuelta vuelta3 = new Vuelta(piloto, equipo, circuito, 91.3); // 91.3 segundos en la vuelta

        listaVueltas.add(vuelta1);
        listaVueltas.add(vuelta2);
        listaVueltas.add(vuelta3);

        assertEquals(3, listaVueltas.size());
        assertTrue(listaVueltas.contains(vuelta1));
        assertTrue(listaVueltas.contains(vuelta2));
        assertTrue(listaVueltas.contains(vuelta3));

        assertEquals(90.5, listaVueltas.get(0).getTiempo(), 0.001);
        assertEquals(88.1, listaVueltas.get(1).getTiempo(), 0.001);
        assertEquals(91.3, listaVueltas.get(2).getTiempo(), 0.001);
    }


}
