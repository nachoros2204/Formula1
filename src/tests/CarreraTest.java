package src.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import src.Carrera;
import src.Circuito;
import src.Piloto;

public class CarreraTest {

    @Test
    public void testCircuitoDeCarrera() {

        //crear circuito
        Circuito circuito = new Circuito("Interlagos", 4.309, 71);
        String fechaCarrera = "2024-11-01";

        //crear pilotos
        List<Piloto> listaPilotos = new ArrayList<>();
        listaPilotos.add(new Piloto("Lewis Hamilton", "Reino Unido"));
        
        //crear carrera
        Carrera carrera = new Carrera(fechaCarrera, circuito, listaPilotos);

        //verificar circuito correcto
        assertEquals(circuito, carrera.getCircuito());
        assertEquals("Interlagos", carrera.getCircuito().obtenerNombreCircuito());
        assertEquals(4.309, carrera.getCircuito().obtenerLongitud(), 0.001);
        assertEquals(71, carrera.getCircuito().obtenerVueltasCantidad());
    }

    @Test
    public void testFechaDeCarrera() {
        //crear un circuito
        Circuito circuito = new Circuito("Interlagos", 4.309, 71);
        String fechaCarrera = "2024-11-01";

        //crear pilotos
        List<Piloto> listaPilotos = new ArrayList<>();
        listaPilotos.add(new Piloto("Lewis Hamilton", "Reino Unido"));

        //crear carrera
        Carrera carrera = new Carrera(fechaCarrera, circuito, listaPilotos);

        //verificar fecha correcta
        assertEquals(fechaCarrera, carrera.getFecha());
    }


    @Test
    public void testAgregarPilotosACarrera() {
        //crear circuito
        Circuito circuito = new Circuito("Interlagos", 4.309, 71);

        //crear fecha de carrera
        String fechaCarrera = String.valueOf("2024-11-01");

        //crear pilotos
        Piloto piloto1 = new Piloto("Franco Colapinto", "Argentina");
        Piloto piloto2 = new Piloto("Charles Leclerc", "Mónaco");
        Piloto piloto3 = new Piloto("Max Verstappen", "Países Bajos");

        //crear lista pilotos
        List<Piloto> listaPilotos = new ArrayList<>();
        listaPilotos.add(piloto1);
        listaPilotos.add(piloto2);
        listaPilotos.add(piloto3);

        //crear carrera con la lista de pilotos
        Carrera carrera = new Carrera(fechaCarrera, circuito, listaPilotos);

        //obtener la lista de pilotos en la carrera
        List<Piloto> pilotosEnCarrera = carrera.getListaPilotos();

        //verificar que se hayan agregado los pilotos correctamente
        assertEquals(3, pilotosEnCarrera.size());
        assertTrue(pilotosEnCarrera.contains(piloto1));
        assertTrue(pilotosEnCarrera.contains(piloto2));
        assertTrue(pilotosEnCarrera.contains(piloto3));

        //verificar nombres y nacionalidades de los pilotos agregados
        assertEquals("Franco Colapinto", pilotosEnCarrera.get(0).obtenerNombre());
        assertEquals("Argentina", pilotosEnCarrera.get(0).obtenerNacionalidad());
        assertEquals("Charles Leclerc", pilotosEnCarrera.get(1).obtenerNombre());
        assertEquals("Mónaco", pilotosEnCarrera.get(1).obtenerNacionalidad());
        assertEquals("Max Verstappen", pilotosEnCarrera.get(2).obtenerNombre());
        assertEquals("Países Bajos", pilotosEnCarrera.get(2).obtenerNacionalidad());
    }
}

